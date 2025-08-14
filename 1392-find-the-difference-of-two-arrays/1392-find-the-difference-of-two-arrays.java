class Solution {
    public List<List<Integer>> findDifference(int[] arr1, int[] arr2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for (int i : arr1) {
            if (!l1.contains(i)) l1.add(i);
        }
        for (int i : arr2) {
            if (!l2.contains(i)) l2.add(i);
        }
        List<Integer> l1Copy = new ArrayList<>(l1);
        List<Integer> l2Copy = new ArrayList<>(l2);
        l1.removeAll(l2Copy);
        l2.removeAll(l1Copy);
        List<List<Integer>> res = new ArrayList<>();
        res.add(l1);
        res.add(l2);
        return res;
    }
}