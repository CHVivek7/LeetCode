class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i = 0;i<heights.length;i++){
            for(int j = 0;j<heights.length;j++){
                if(heights[i]>heights[j]){
                    int temp = heights[j];
                    heights[j] = heights[i];
                    heights[i] = temp;
                    String str = names[j];
                    names[j] = names[i];
                    names[i] = str;
                }
            }
        }
        return names;
    }
}