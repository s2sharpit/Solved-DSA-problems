class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1, iOfZero = 0;
        boolean isZero = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (isZero) {
                    Arrays.fill(nums, 0);
                    return nums;
                }
                isZero = true;
                iOfZero = i;
                continue;
            }
            product *= nums[i];
        }

        if (isZero) {
            Arrays.fill(nums, 0);
            nums[iOfZero] = product;
            return nums;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = product / nums[i];
        }

        return nums;
    }
}