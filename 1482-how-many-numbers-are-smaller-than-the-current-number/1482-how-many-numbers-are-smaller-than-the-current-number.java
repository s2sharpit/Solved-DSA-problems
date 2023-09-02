class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];

        int count;
        for (int i = 0; i < ans.length; i++) {
            count = 0;
            for (int j = 0; j < ans.length; j++) {
                if (i != j && nums[j] < nums[i])
                    count++;
            }
            ans[i] = count;
        }
        return ans;
    }
}