class Solution {
    public int specialArray(int[] nums) {
      
       Arrays.sort(nums);
        for(int i = 0 ; i <= nums[nums.length - 1] ; i++){
            if(i == nums.length-leftMostIndex(nums,i)) return i ;
        }
        return -1;
    }
    int leftMostIndex(int[] nums ,int target){
       int left = 0 , right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]>=target){
                right = mid-1;
            }else if(nums[mid]<target){
                left = mid+1;
            }
        }
        return left;
    }
}