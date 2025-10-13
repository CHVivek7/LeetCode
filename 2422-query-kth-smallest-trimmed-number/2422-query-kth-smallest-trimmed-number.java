class Node{
    int index;
    String val;
    Node(int x, String v){
        index=x;
        val=v;
    }
}

class MyComparator implements Comparator<Node>{
    public int compare(Node n1, Node n2){
        return n1.val.compareTo(n2.val);
    }
}

class Solution {
    Map<Integer,List<Node>> map = new HashMap<>();
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int n = nums[0].length();
        int[] res = new int[queries.length];
        for(int i=0;i<n;i++){
            map.put(n-i,new ArrayList<>());
            for(int j=0;j<nums.length;j++){
                map.get(n-i).add(new Node(j,nums[j].substring(i,n)));
            }
            Collections.sort(map.get(n-i),new MyComparator());
        }

        for(int i=0;i<queries.length;i++){
            res[i] = map.get(queries[i][1]).get(queries[i][0]-1).index;
        }
        
        return res;
    }
}