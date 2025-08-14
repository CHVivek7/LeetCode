class Solution {
    public String[] findRelativeRanks(int[] score) {
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<score.length;i++){
            arr.add(score[i]);
        }  
        
        Collections.sort(arr, Collections.reverseOrder()); 
        String[] str = new String[score.length];
        int k=-1;
        for(int i=0;i<score.length;i++){
            k++;
            if(arr.indexOf(score[i]) == 0){
                str[k] = "Gold Medal";
            }
            else if(arr.indexOf(score[i]) == 1){
                str[k] = "Silver Medal";
            }
            else if(arr.indexOf(score[i]) == 2){
                str[k] = "Bronze Medal";
            }
            else{
                str[k] = arr.indexOf(score[i])+1+"";
            }
        }
        return str;
    }
}