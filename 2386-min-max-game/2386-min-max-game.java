class Solution {
    public int minMaxGame(int[] nums) {
        if(nums.length<2){
            return nums[0];
        }
        List<Integer> list = loop(Arrays.stream(nums).boxed().collect(Collectors.toCollection(ArrayList::new)));
        
        return list.get(0);
    }
    public List<Integer> loop (List<Integer> list){
        while(list.size()>1){
            List<Integer> dummy = new ArrayList<>();
            boolean min = true;
            boolean max = false;
            for(int i = 1;i<list.size();i+=2){
                if(min){
                    max = true;
                    min = false;
                    dummy.add(Math.min(list.get(i),list.get(i-1)));
                }
                else if(max){
                    max = false;
                    min = true;
                    dummy.add(Math.max(list.get(i),list.get(i-1)));
                }
            }
            list = dummy;
        }
        return list;
    }
}