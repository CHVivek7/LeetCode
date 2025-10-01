class Solution {
    public int[] minOperations(String boxes) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<boxes.length();i++){
            if(boxes.charAt(i)=='1'){
                list.add(i);
            }
        }
        int[] ans = new int[boxes.length()];
        int n = 0;
        for(int i = 0;i<boxes.length();i++){
            int sum = 0;
            for(int j = 0;j<list.size();j++){
                sum += (Math.abs(list.get(j)-i));
            }
            ans[n] = sum;
            n++;
        }
        return ans;
    }
}