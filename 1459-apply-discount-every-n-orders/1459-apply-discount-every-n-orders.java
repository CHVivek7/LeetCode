class Cashier {
    int count = 0, num, deduct;
    Map<Integer, Integer> map = new HashMap<>();
    public Cashier(int n, int discount, int[] products, int[] prices) {
        map.clear();
        num = n;
        deduct = discount;
        for(int i = 0;i<products.length;i++){
            map.put(products[i], prices[i]);
        }
    }
    
    public double getBill(int[] product, int[] amount) {
        count+=1;
        double bill = 0;
        for(int i = 0;i<product.length;i++){
            bill += (map.get(product[i]) * amount[i]);
        }
        if(count % num == 0){
            bill = bill * ((double)( 100 - deduct) / 100);
        }
        return bill;
    }
}

/**
 * Your Cashier object will be instantiated and called as such:
 * Cashier obj = new Cashier(n, discount, products, prices);
 * double param_1 = obj.getBill(product,amount);
 */