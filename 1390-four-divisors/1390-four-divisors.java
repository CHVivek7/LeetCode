class Solution {
    public int sumFourDivisors(int[] nums) {
        Map<Integer, List<Integer>> cache = new HashMap<>();
        int sum = 0;
        for (int x : nums) {
            if (cache.containsKey(x)) {
                List<Integer> divisors = cache.get(x);
                if (divisors.size() == 4) {
                    sum += divisors.stream().mapToInt(Integer::intValue).sum();
                    
                }
            } else {
                List<Integer> divisors = new ArrayList<>();
                int limit = (int) Math.sqrt(x);
                for (int d = 1; d <= limit; d++) {
                    if (x % d == 0) {
                        divisors.add(d);
                        int pair = x / d;
                        if (d != pair) {
                            divisors.add(pair);
                        }
                    }
                }
                if(divisors.size()==4){
                    sum += divisors.stream().mapToInt(Integer::intValue).sum();
                }
                cache.put(x, divisors);
            }
        }
        return sum;
    }
}