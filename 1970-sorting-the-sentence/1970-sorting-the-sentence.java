class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] str = new String[arr.length];
        for(int i = 0;i<arr.length;i++){
            int n = Integer.parseInt(arr[i].charAt(arr[i].length()-1)+"");
            str[n-1] = arr[i].substring(0,arr[i].length()-1);
            
        }
        return String.join(" ", str);
    }
}