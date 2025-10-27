class UndergroundSystem {
    Map<String, List<Integer>> stations;
    Map<Integer, List<String>> customer;
    public UndergroundSystem() {
        stations = new HashMap<>();
        customer = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        List<String> list = new ArrayList<>();
        list.add(stationName);
        list.add(t+"");
        customer.put(id, list);
    }
    
    public void checkOut(int id, String stationName, int t) {
        List<String> list = customer.get(id);
        String str = list.get(0)+" "+stationName;
        int val = t - Integer.parseInt(list.get(1));
        if(stations.containsKey(str)){
            List<Integer> list1= stations.get(str);
            list1.add(val);
            stations.put(str, list1);
        }
        else{
            List<Integer> list1 = new ArrayList<>();
            list1.add(val);
            stations.put(str, list1);
        }
    }
    
    public double getAverageTime(String startStation, String endStation) {
        List<Integer> list = stations.get(startStation+" "+endStation);
        double sum = 0.0;
        for(int i =0;i<list.size();i++){
            sum += list.get(i);
        }    
        return (double) sum / list.size();
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
