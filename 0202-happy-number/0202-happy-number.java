class Solution {
    public boolean isHappy(int num){
        HashSet<Integer> set = new HashSet<>();

        while (true){
            int squares = calculateSumOfSquares(num);
            if(squares == 1){
                return true;
            }
            if(set.contains(squares)){
                return false;
            } else {
                set.add(squares);
                num = squares;
            }
        }
    }

    private static int calculateSumOfSquares(int num) {
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum += digit * digit;
            num = num / 10;
        }
        return sum;
    }
}