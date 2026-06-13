class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length,j=0;
        int re[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2==0)
            {
                re[j++]=nums[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2!=0)
            {
                re[j++]=nums[i];
            }
        }
        return re;
    }
}