class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());  
        List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());  
        List<Integer> finalList = new ArrayList<>(); 
         
        for(int i=0;i<list1.size();i++){
            if(list2.contains(list1.get(i)) && !finalList.contains(list1.get(i))){
                finalList.add(list1.get(i));
            }
        }
        int[] arr = new int[finalList.size()];
        for(int i=0;i<finalList.size();i++){
            arr[i]= finalList.get(i);
        }
        return arr;
    }
}