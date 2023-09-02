class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < ans.length; i++) {
            int count = 0;
            for (int j = 0; j < ans.length; j++) {
                if (nums[j] < nums[i])
                    count++;
            }
            ans[i] = count;
        }
        return ans;
    }
}