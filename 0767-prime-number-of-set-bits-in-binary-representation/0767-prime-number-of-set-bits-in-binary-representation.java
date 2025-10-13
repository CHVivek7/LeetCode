class Solution {
    List<Integer> primes ;
    List<Integer> non_primes ;
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        primes = new ArrayList<>();
        non_primes = new ArrayList<>();
        while(left<=right){
            String str = Integer.toBinaryString(left);
            str = str.replace("0","");
            if(primes.contains(str.length())){
                System.out.println(left);
                count++;
            }
            else if(non_primes.contains(str.length())){
                left++;
                continue;
            }
            else{
                if(isPrime(str.length())){
                    primes.add(str.length());
                    count++;
                }else{
                    non_primes.add(str.length());
                }
            }
            left++;
        }
        return count;
    }
    public boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2;i*i<=n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}