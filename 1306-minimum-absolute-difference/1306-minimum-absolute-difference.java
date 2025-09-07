class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            int currDiff = Math.abs(arr[i] - arr[i + 1]);
            if (currDiff < minDiff) {
                minDiff = currDiff;
                res.clear();
                addPairToRes(arr[i], arr[i + 1], res);
            }
            else if (currDiff == minDiff) {
                addPairToRes(arr[i], arr[i + 1], res);
            }
        }
        return res;
    }

    private void addPairToRes(int num1, int num2, List<List<Integer>> res) {
        List<Integer> pair = Arrays.asList(num1, num2);
        res.add(pair);
    }
}