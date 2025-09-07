class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        for(int i = 0;i<heights.length;i++){
            expected[i] = heights[i];
        }
        Arrays.sort(expected);
        int count = 0;
        for(int i : heights)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i : expected){
            System.out.println(i);
        }
        for(int i = 0;i<heights.length;i++){
            if(heights[i]!=expected[i]){
                count++;
            }
        }
        return count;
    }
}