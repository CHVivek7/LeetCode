public class Solution
    {
    public static int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int minFinishTime = Integer.MAX_VALUE;
        
        for (int i = 0; i < landStartTime.length; i++) {
            for (int j = 0; j < waterStartTime.length; j++) {
                // Sequence 1: Land -> Water
                int startLand = Math.max(landStartTime[i], 0);
                int finishLand = startLand + landDuration[i];
                int startWaterAfterLand = Math.max(waterStartTime[j], finishLand);
                int finishWater = startWaterAfterLand + waterDuration[j];
                minFinishTime = Math.min(minFinishTime, finishWater);

                // Sequence 2: Water -> Land
                int startWater = Math.max(waterStartTime[j], 0);
                int finishWaterSeq = startWater + waterDuration[j];
                int startLandAfterWater = Math.max(landStartTime[i], finishWaterSeq);
                int finishLandSeq = startLandAfterWater + landDuration[i];
                minFinishTime = Math.min(minFinishTime, finishLandSeq);
            }
        }
        return minFinishTime;
    }

    public static void main(String[] args) {
        // Example test cases
        int[] landStartTime1 = {2, 8};
        int[] landDuration1 = {4, 1};
        int[] waterStartTime1 = {6};
        int[] waterDuration1 = {3};
        System.out.println(earliestFinishTime(landStartTime1, landDuration1, waterStartTime1, waterDuration1)); // Output: 9

        int[] landStartTime2 = {5};
        int[] landDuration2 = {3};
        int[] waterStartTime2 = {1};
        int[] waterDuration2 = {10};
        System.out.println(earliestFinishTime(landStartTime2, landDuration2, waterStartTime2, waterDuration2)); // Output: 14
    }
}