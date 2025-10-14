class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        if (suits[0] == suits[1] && suits[1] == suits[2] && suits[2] == suits[3] && suits[3] == suits[4]) {
            return "Flush";
        }
        int[] rankCounts = new int[14];
        for (int rank : ranks) {
            if (++rankCounts[rank] == 3) {
                return "Three of a Kind";
            }
        }
        for (int count : rankCounts) {
            if (count == 2) {
                return "Pair";
            }
        }
        return "High Card";
    }
}