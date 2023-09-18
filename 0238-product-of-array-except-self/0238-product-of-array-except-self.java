class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        ans[ans.length-1]=nums[nums.length-1];
        for(int i=ans.length-2;i>=0;i--){
            ans[i]=nums[i]*ans[i+1];
        }
        int prod=1;
        if(nums.length>1){
            prod*=nums[0];
            nums[0]=ans[1];
        }else{
            return new int[]{1};
        }
        for(int i=1;i<ans.length-1;i++){
            int temp=nums[i];
            nums[i]=prod*ans[i+1];
            prod*=temp;
        }
        nums[ans.length-1]=prod;
        return nums;
    }
}