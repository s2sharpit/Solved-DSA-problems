class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1, end = nums.length - 1;
            
            while (start <= end) {
                int mid = start + (end - start) / 2;
                int sum = nums[i] + nums[mid];
                if (sum == target) {
                    return new int[] {i + 1, mid + 1};
                } else if (sum > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return new int[] {-1, -1};
    }
}