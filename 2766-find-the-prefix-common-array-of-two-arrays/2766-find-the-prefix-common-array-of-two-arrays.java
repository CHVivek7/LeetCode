class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        int[] result = new int[A.length];
        for(int i = 0;i<A.length;i++){
            listA.add(A[i]);
            listB.add(B[i]);
            List<Integer> common = listB.stream()
                                    .filter(listA::contains)
                                    .collect(Collectors.toList());
            result[i] = common.size();
            common.clear();
        }
        return result;
    }
}