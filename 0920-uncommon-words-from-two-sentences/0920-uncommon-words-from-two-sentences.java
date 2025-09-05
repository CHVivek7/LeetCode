class Solution {
    public String[] uncommonFromSentences(String s, String t) {
        String str = s+" "+t;
        List<String> blocked = new ArrayList<>();
        List<String> set = new ArrayList<>();
        String[] arr = str.split(" ");
        for(int i = 0; i< arr.length;i++){
            if(set.contains(arr[i])){
                set.remove(arr[i]);
                blocked.add(arr[i]);
            }
            else{
                if(!blocked.contains(arr[i])){
                    set.add(arr[i]);   
                }
            }
        }
        String[] ans = new String[set.size()];
        for(int i = 0;i<set.size();i++){
            ans[i] = set.get(i);
        }
        return ans;
    }
}