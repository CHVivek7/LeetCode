class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count =0;
        int i = 0;
        while(tickets[k]!=0){
            if(tickets[i]!=0){
                tickets[i]--;
                count++;
            }
            i = (i+1)%tickets.length;
        }
        return count;
    }
}


// class Solution {
//     public int timeRequiredToBuy(int[] tickets, int k) {
//         Queue<List<Integer>> queue = new LinkedList<>();
// 		for(int i =0;i<tickets.length;i++){
// 		    List<Integer> list = new ArrayList<>();
// 		    list.add(i);
// 		    list.add(tickets[i]);
// 		    queue.offer(list);
// 		}
// 		int count = 0;
// 		boolean ch = true;
// 		while(ch){
// 		    List<Integer> list = queue.poll();
// 		    if(list.get(1) != 0){
// 		        list.set(1, list.get(1)-1);
// 		        if(list.get(1) !=0){
// 		            queue.offer(list);
// 		        }
// 		        count++;
// 		    }
// 		    if(list.get(0) == k && list.get(1)==0){
// 		        ch = false;
// 		    }
// 		}
// 		return count;
//     }
// }