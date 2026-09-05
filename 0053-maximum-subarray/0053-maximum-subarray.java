class Solution {
    public int maxSubArray(int[] nums) {
        int maxending=nums[0],result=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            maxending=Math.max(maxending+nums[i],nums[i]);
            result=Math.max(result,maxending);
        }
    return result;
    }
}