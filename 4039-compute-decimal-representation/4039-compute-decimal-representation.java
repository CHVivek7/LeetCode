class Solution {
    public int[] decimalRepresentation(int n) {
        int i = 1;
        List<Integer> list = new ArrayList<>();
        while(n > 0){
            int x = n % 10;
            x = x * i;
            if(x>0){
                list.add(x);    
            }            
            n /= 10;
            i *= 10;
        }
        Collections.reverse(list);
        int[] arr = new int[list.size()];
        for(int j = 0;j<list.size();j++){
            arr[j] = list.get(j);
        }
        return arr;
    }
}