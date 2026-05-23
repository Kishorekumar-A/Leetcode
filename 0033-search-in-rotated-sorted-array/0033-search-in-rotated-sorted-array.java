class Solution {
    public int search(int[] nums, int target) {
        // boolean f=false;
        int in=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target) return i;
            // if(nums[i]<nums[i+1])
            // {
            //     in =i;
            //     break;
            // }
            // if(nums[i]==target||nums[i+1]==target)f=true;
        }
        // if(!f)return -1;

return -1;
    }
}