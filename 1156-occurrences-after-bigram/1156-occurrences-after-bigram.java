class Solution {
    public String[] findOcurrences(String str, String first, String second) {
        String[] arr = str.split(" ");
        if(arr.length <3){
            return new String[1];
        }
        List<String> list = new ArrayList<>();
        for(int i = 2;i<arr.length;i++){
            if(arr[i-2].equals(first) && arr[i-1].equals(second)){
                list.add(arr[i]);
            }
        }
        String[] ans = new String[list.size()];
        for(int i = 0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}