/*
 * @lc app=leetcode id=119 lang=java
 *
 * [119] Pascal's Triangle II
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        res.add(row);
        for(int i=1;i<=rowIndex;i++){
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for(int j=1;j<i;j++){
                newRow.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
            }
            newRow.add(1);
            res.add(newRow);
            
        }
        return res.get(rowIndex);
    }
}

