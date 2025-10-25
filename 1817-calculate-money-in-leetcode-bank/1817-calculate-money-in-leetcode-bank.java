class Solution {
    public int totalMoney(int n) {
        int week = n / 7;
        int days = n % 7;
        System.out.println(week +" "+days);
        int p = 7;
        int sum= 0;
        if(week > 0){
            for(int i = 0;i<week;i++){
                sum += (totalSum(p) - totalSum(i));
                p++;
            }
        }
        for(int i = 0;i<days;i++){
            week++;
            sum+= week;
        }
        return sum;
    }
    public int totalSum(int n){
        return (int) (n * (n + 1)) / 2;
    }
}