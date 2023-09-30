class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length -1;

        while ( l <= r) {
            int m = l + (r - l) / 2;
            if (target < nums[m]) {
                r = m -1;
            } else if (target > nums[m]){
                l = m +1;
            } else {
                return m;
            }
        }
        return l;
    }
}