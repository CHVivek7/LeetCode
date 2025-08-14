import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {

    // Helper method to calculate min finish time for a specific order (e.g., firstTasks -> secondTasks)
    // firstStartTimes, firstDurations: arrays for the first set of tasks in the sequence
    // secondStartTimes, secondDurations: arrays for the second set of tasks in the sequence
    private int calculateMinFinishTime(int[] firstStartTimes, int[] firstDurations,
                                       int[] secondStartTimes, int[] secondDurations) {

        int N1 = firstStartTimes.length;
        int N2 = secondStartTimes.length;

        // If either set of tasks is empty, a pair cannot be formed.
        // Return a very large value to indicate impossibility for this sequence.
        if (N1 == 0 || N2 == 0) {
            return Integer.MAX_VALUE;
        }

        // 1. Prepare and sort the second tasks
        // Each element in secondTasks will be an array: [startTime, duration]
        List<int[]> secondTasks = new ArrayList<>();
        for (int i = 0; i < N2; i++) {
            secondTasks.add(new int[]{secondStartTimes[i], secondDurations[i]});
        }

        // Sort second tasks based on their start time.
        // This is crucial for binary search and precomputing min/max efficiently.
        Collections.sort(secondTasks, Comparator.comparingInt(a -> a[0]));

        // 2. Precompute prefix minimum durations for second tasks
        // minPrefixDuration[j] stores the minimum duration among second tasks from index 0 to j-1.
        // (i.e., minPrefixDuration[j] covers elements up to secondTasks.get(j-1))
        int[] minPrefixDuration = new int[N2 + 1];
        minPrefixDuration[0] = Integer.MAX_VALUE; // Sentinel for empty prefix
        for (int i = 0; i < N2; i++) {
            minPrefixDuration[i + 1] = Math.min(minPrefixDuration[i], secondTasks.get(i)[1]);
        }

        // 3. Precompute suffix minimum (startTime + duration) for second tasks
        // minSuffixSum[j] stores the minimum (startTime + duration) among second tasks from index j to N2-1.
        int[] minSuffixSum = new int[N2];
        minSuffixSum[N2 - 1] = secondTasks.get(N2 - 1)[0] + secondTasks.get(N2 - 1)[1]; // Last element
        for (int i = N2 - 2; i >= 0; i--) {
            minSuffixSum[i] = Math.min(minSuffixSum[i + 1], secondTasks.get(i)[0] + secondTasks.get(i)[1]);
        }

        int minOverallFinishTimeForThisOrder = Integer.MAX_VALUE;

        // 4. Iterate through each first task to find the optimal second task
        for (int i = 0; i < N1; i++) {
            // Calculate the actual finish time of the current first task.
            // A task cannot start before time 0.
            int firstTaskActualFinishTime = Math.max(firstStartTimes[i], 0) + firstDurations[i];

            // Use binary search to find the insertion point for 'firstTaskActualFinishTime'
            // in the sorted 'secondTasks' list based on 'startTime'.
            // 'insertionPoint' will be the index of the first element >= firstTaskActualFinishTime.
            // If no such element, it's -(insertion point) - 1.
            int insertionPoint = Collections.binarySearch(secondTasks, new int[]{firstTaskActualFinishTime, 0},
                                                        Comparator.comparingInt(a -> a[0]));

            // Adjust insertionPoint if binary search returns a negative value.
            // A negative value means the element was not found, and its position would be -(return value) - 1.
            if (insertionPoint < 0) {
                insertionPoint = -(insertionPoint + 1);
            }

            // Case 1: The second task can start at or after its own scheduled start time.
            // This applies to second tasks whose startTime >= firstTaskActualFinishTime.
            // These are the tasks from 'insertionPoint' to N2-1 in the sorted list.
            if (insertionPoint < N2) {
                // The finish time is directly (secondTask.startTime + secondTask.duration).
                // We use the precomputed suffix minimum to find the best among these.
                minOverallFinishTimeForThisOrder = Math.min(minOverallFinishTimeForThisOrder, minSuffixSum[insertionPoint]);
            }

            // Case 2: The second task is forced to start at firstTaskActualFinishTime.
            // This applies to second tasks whose startTime < firstTaskActualFinishTime.
            // These are the tasks from 0 to 'insertionPoint - 1' in the sorted list.
            if (insertionPoint > 0) {
                // The actual start time for these second tasks is firstTaskActualFinishTime.
                // We need the minimum duration from this group to add to firstTaskActualFinishTime.
                // We use the precomputed prefix minimum duration.
                int minDurationForThisGroup = minPrefixDuration[insertionPoint];

                // Ensure minDurationForThisGroup is not MAX_VALUE (meaning no tasks in this group)
                if (minDurationForThisGroup != Integer.MAX_VALUE) {
                     minOverallFinishTimeForThisOrder = Math.min(minOverallFinishTimeForThisOrder, 
                                                                  firstTaskActualFinishTime + minDurationForThisGroup);
                }
            }
        }
        return minOverallFinishTimeForThisOrder;
    }

    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int minFinishTime = Integer.MAX_VALUE;

        // Calculate the minimum finish time for the Land -> Water sequence
        int minFinishTimeLandWater = calculateMinFinishTime(landStartTime, landDuration, waterStartTime, waterDuration);
        minFinishTime = Math.min(minFinishTime, minFinishTimeLandWater);

        // Calculate the minimum finish time for the Water -> Land sequence
        // This is symmetric, so we just swap the roles of land and water tasks.
        int minFinishTimeWaterLand = calculateMinFinishTime(waterStartTime, waterDuration, landStartTime, landDuration);
        minFinishTime = Math.min(minFinishTime, minFinishTimeWaterLand);
        
        // If no tasks exist in either array, minFinishTime might remain MAX_VALUE.
        // The problem constraints usually guarantee at least one task, but it's good practice
        // to consider edge cases. Here, if both are empty, it correctly returns MAX_VALUE.
        return minFinishTime;
    }
}