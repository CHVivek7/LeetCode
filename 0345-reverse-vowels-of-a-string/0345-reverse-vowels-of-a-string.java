class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        char[] ch = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            while (i < j && !vowels.contains(ch[i])) {
                i++;
            }
            while (i < j && !vowels.contains(ch[j])) {
                j--;
            }
            if (i < j) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }

        return new String(ch);
    }
}