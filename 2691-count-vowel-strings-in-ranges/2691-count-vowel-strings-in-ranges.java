class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] res = new int[n];

        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));

        for (int i=0; i<n; i++) {
            char startChar = words[i].charAt(0);
            char endChar = words[i].charAt(words[i].length() - 1);
            if (vowels.contains(startChar) && vowels.contains(endChar)) {
                res[i] = (i > 0 ? res[i-1] : 0) + 1;
            } else {
                res[i] = (i > 0 ? res[i-1] : 0);
            }
        }

        int[] result = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int left = queries[i][0];
            int right = queries[i][1];
            if(left == 0){
                result[i] = res[right];
            }
            else{
                result[i] = res[right] - res[left -1];
            }
        }
        return result;
    }
}