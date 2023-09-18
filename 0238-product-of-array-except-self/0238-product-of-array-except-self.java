class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount=0;
        int product=1;
        for(int i:nums){
            if(i==0){
                zeroCount++;
            }else{
                product*=i;
            }
        }
        if(zeroCount>0){
            if(zeroCount>1){
                nums=new int[nums.length];
                return nums;
            }else{
                int i=0;
                while(nums[i]!=0){
                    i++;
                }
                nums=new int[nums.length];
                nums[i]=product;
                return nums;
            }
        }
        for(int i=0;i<nums.length;i++){
                nums[i]=product/nums[i];
        }
        return nums;
    }
}