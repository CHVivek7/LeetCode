class Bank {
    long[] array;
    public Bank(long[] balance) {
        array = Arrays.copyOf(balance, balance.length);
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(account1 > array.length || account2 > array.length){
            return false;
        }
        if(array[account1 - 1] < money){
            return false;
        }
        array[account1 - 1] -= money;
        array[account2 - 1] += money;
        return true;
    }
    
    public boolean deposit(int account, long money) {
        if(account > array.length){
            return false;
        }
        if(account > array.length){
            return false;
        }
        array[account - 1] += money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(account > array.length){
            return false;
        }
        if(array[account - 1] < money){
            return false;
        }
        array[account - 1] -= money;
        return true;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */