class Solution {
    public String sortVowels(String str) {
        List<String> list = new ArrayList<>();
        String vowels = "aeiouAEIOU";
        for(int i = 0;i<str.length();i++){
            if(vowels.contains(str.charAt(i)+"")){
                list.add(str.charAt(i)+"");
            }
        }
        Collections.sort(list);
        //String vowels = "aeiouAEIOU";
        String ans = "";
        int n =0;
        for(int i = 0;i<str.length();i++){
            if(vowels.contains(str.charAt(i)+"")){
                ans+=list.get(n);
                n++;
            }else{
                ans+=str.charAt(i)+"";
            }
        }
        return ans;
    }
}