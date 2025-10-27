class Solution {
    public int numberOfBeams(String[] bank) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<bank.length;i++){
            bank[i] = bank[i].replaceAll("0","");
            if(bank[i].length() > 0){
                list.add(bank[i].length());
            }
        }
        for(int i = 0;i<list.size()-1;i++){
            sum += (list.get(i) * list.get(i+1));
        }
        return sum;
    }
}