class Solution {
    public List<String> cellsInRange(String str) {
        char start = str.charAt(0);
        char end = str.charAt(3);
        List<String> list = new ArrayList<>();
        while(start <= end){
            int p = Integer.parseInt(str.charAt(1)+"");
            int q = Integer.parseInt(str.charAt(str.length()-1)+"");
            for(int i = p;i<=q;i++){
                list.add(start+""+i);
            }
            start++;
        }
        return list;
    }
}