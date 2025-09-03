class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        // Build frequency map of required letters (a-z)
        int[] need = new int[26];
        for (char c : licensePlate.toCharArray()) {
            if (Character.isLetter(c)) {
                need[Character.toLowerCase(c) - 'a']++;
            }
        }

        String best = null;
        int bestLen = Integer.MAX_VALUE;

        for (String w : words) {
            if (isCompleting(w, need)) {
                if (w.length() < bestLen) {
                    best = w;
                    bestLen = w.length();
                }
            }
        }
        return best;
    }

    // Check if word contains all required letters with proper counts
    private boolean isCompleting(String word, int[] need) {
        int[] have = new int[26];
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                int idx = Character.toLowerCase(c) - 'a';
                if (0 <= idx && idx < 26) have[idx]++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (have[i] < need[i]) return false;
        }
        return true;
    }
}