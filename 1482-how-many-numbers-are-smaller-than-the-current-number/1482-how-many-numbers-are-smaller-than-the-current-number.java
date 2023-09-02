class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] bucket = new int[102];
        for(int i=0; i<nums.length; bucket[nums[i]+1]++, i++);
        for(int i=0; i<101; bucket[i+1] += bucket[i], i++);
        for(int i=0; i<nums.length; nums[i] = bucket[nums[i]], i++);
        return nums;
    }
}