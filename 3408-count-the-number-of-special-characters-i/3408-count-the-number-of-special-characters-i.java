class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isLowerCase(c) && !list.contains(c)) {
                char upper = Character.toUpperCase(c);
                if (word.indexOf(upper) >= 0) {
                    count++;
                    list.add(c);
                }
            }
        }
        return count;
    }
}