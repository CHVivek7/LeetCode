class CombinationIterator {
    static List<String> hset = new ArrayList<>();
    public static void subset(char[] set, int n, int m, List<Character> partial, int index) {
        if (partial.size() == m) {
            StringBuilder sb = new StringBuilder();
            for (Character c : partial) sb.append(c);
            String str = sb.toString().replaceAll("[^a-zA-Z]", "");
            if (!str.isEmpty()) {
                hset.add(str);
            }
            return;
        }

        if (index >= n) {
            return;
        }
        partial.add(set[index]);
        subset(set, n, m, partial, index + 1);
        partial.remove(partial.size() - 1);
        subset(set, n, m, partial, index + 1);
    }
    public CombinationIterator(String str, int m) {
        char[] ch = str.toCharArray();
        hset.clear();
        subset(ch, str.length(), m, new ArrayList<>(), 0);
    }
    
    public String next() {
        if(hset.isEmpty()){
            return "";
        }
        String x = hset.get(0);
        hset.remove(0);
        return x;
    }
    
    public boolean hasNext() {
        return !hset.isEmpty();
    }

}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */