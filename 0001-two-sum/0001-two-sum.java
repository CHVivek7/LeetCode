import java.util.*;

class Solution {
    public int[] twoSum(int[] sortedNums, int target) {
        List<Integer> list = new ArrayList<>();
        for (int i : sortedNums) {
            list.add(i);
        }
        Arrays.sort(sortedNums);                // Sort the clone
        int left = 0;
        int right = sortedNums.length - 1;
        int[] result = new int[2];

        while (left < right) {
            int sum = sortedNums[left] + sortedNums[right];
            if (sum == target) {
                int index1 = list.indexOf(sortedNums[left]);
                list.set(index1, Integer.MIN_VALUE); 
                int index2 = list.indexOf(sortedNums[right]);
                result[0] = index1;
                result[1] = index2;
                return result;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[0]; 
    }
}