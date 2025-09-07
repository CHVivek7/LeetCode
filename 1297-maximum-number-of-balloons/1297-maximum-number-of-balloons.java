class Solution {
    public int maxNumberOfBalloons(String chars) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('b',0);
        map.put('a',0);
        map.put('l',0);
        map.put('o',0);
        map.put('n',0);
        for(int i = 0;i<chars.length();i++){
            if(map.containsKey(chars.charAt(i))){
                map.put(chars.charAt(i),map.get(chars.charAt(i))+1);
            }
        }
        System.out.println(map);
        String str = "balloon";
        boolean a = true;
        int count = 0;
        while(a){
            int n = 0;
            for(int i = 0;i<str.length();i++){
                if(map.get(str.charAt(i))>0){
                    map.put(str.charAt(i),map.get(str.charAt(i))-1);
                }
                else{
                    return count;
                }
            }
            count++;
        }
        return count;
    }
}