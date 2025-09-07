class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int total = 0;
        for(int i = 0;i<distance.length;i++){
            total+=distance[i];
        }
        int sum = 0;
        if(start < destination){
            for(int i = start ;i<destination;i++){
                sum+=distance[i];
            }
        }else{
            for(int i = destination;i<start;i++){
                sum+=distance[i];
            }
        }
        int ans = total-sum;
        return Math.min(ans, sum);
    }
}