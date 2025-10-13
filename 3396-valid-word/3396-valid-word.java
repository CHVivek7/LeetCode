class Solution {
    public boolean isValid(String word) {
        if (word == null || word.length() < 3) {
            return false;
        }
        word = word.toLowerCase();
        boolean hasVowel = false;
        boolean hasConsonant = false;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!Character.isDigit(c) && !(c >= 'a' && c <= 'z')) {
                System.out.println(word.charAt(i));
                return false;
            }
            if (c >= 'a' && c <= 'z') {
                if (vowels.indexOf(c) >= 0) {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            }
        }

        return hasVowel && hasConsonant;
    }
}