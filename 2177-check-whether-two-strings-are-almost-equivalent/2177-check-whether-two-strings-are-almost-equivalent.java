class Solution {
    public boolean checkAlmostEquivalent(String str1, String str2) {
        String str = str1+str2;
        StringBuilder sb = new StringBuilder();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        char prev = arr[0];
        sb.append(prev);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != prev) {
                sb.append(arr[i]);
                prev = arr[i];
            }
        }
        str = sb.toString();
        System.out.println(str);
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(int i=0; i< str1.length();i++){
            char c = str1.charAt(i);
            int count = map1.getOrDefault(c, 0);
            map1.put(c, count + 1);
        }
        
        for(int i=0; i< str2.length();i++){
            char c = str2.charAt(i);
            int count = map2.getOrDefault(c, 0);
            map2.put(c, count + 1);
        }
        for(int i = 0 ;i<str.length();i++){
            int val1 = 0;
            int val2 = 0;
            if(map1.containsKey(str.charAt(i))){
                val1 = map1.get(str.charAt(i));
            }
            if(map2.containsKey(str.charAt(i))){
                val2 = map2.get(str.charAt(i));
            }
            if(Math.abs(val1-val2) > 3){
                return false;
            }
        }
        return true;
    }
}