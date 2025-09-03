class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Map<Character, String> MORSE_MAP = new HashMap<>();
        MORSE_MAP.put('A', ".-");
        MORSE_MAP.put('B', "-...");
        MORSE_MAP.put('C', "-.-.");
        MORSE_MAP.put('D', "-..");
        MORSE_MAP.put('E', ".");
        MORSE_MAP.put('F', "..-.");
        MORSE_MAP.put('G', "--.");
        MORSE_MAP.put('H', "....");
        MORSE_MAP.put('I', "..");
        MORSE_MAP.put('J', ".---");
        MORSE_MAP.put('K', "-.-");
        MORSE_MAP.put('L', ".-..");
        MORSE_MAP.put('M', "--");
        MORSE_MAP.put('N', "-.");
        MORSE_MAP.put('O', "---");
        MORSE_MAP.put('P', ".--.");
        MORSE_MAP.put('Q', "--.-");
        MORSE_MAP.put('R', ".-.");
        MORSE_MAP.put('S', "...");
        MORSE_MAP.put('T', "-");
        MORSE_MAP.put('U', "..-");
        MORSE_MAP.put('V', "...-");
        MORSE_MAP.put('W', ".--");
        MORSE_MAP.put('X', "-..-");
        MORSE_MAP.put('Y', "-.--");
        MORSE_MAP.put('Z', "--..");

        MORSE_MAP.put('0', "-----");
        MORSE_MAP.put('1', ".----");
        MORSE_MAP.put('2', "..---");
        MORSE_MAP.put('3', "...--");
        MORSE_MAP.put('4', "....-");
        MORSE_MAP.put('5', ".....");
        MORSE_MAP.put('6', "-....");
        MORSE_MAP.put('7', "--...");
        MORSE_MAP.put('8', "---..");
        MORSE_MAP.put('9', "----.");
        Set<String> set = new HashSet<>();
        for(String str : words){
            str = str.toUpperCase();
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<str.length();i++){
                sb.append(MORSE_MAP.get(str.charAt(i)));
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}