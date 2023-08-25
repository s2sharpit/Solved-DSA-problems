class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] person : accounts) {
            // when you start a new col, take a new sum for that row
            int sum = 0;
            for (int account : person) {
                sum += account;
            }

            // now we have sum of accounts of person 
            // check with overall ans
            if (sum > ans)
                ans = sum;
        }
        return ans;
    }
}