class Solution {
    // public int leftrotation(int t,int nums[])
    // {
    //     for(int i=nums.length-1;i>0;i--)
    //     {
    //         nums[i]=nums[i-1];
    //     }
    //     nums[0]=t;
    //     int s=0;
    // for(int j=0;j<nums.length;j++)
    //         {
    //             s+=(j*nums[j]);
    //         }
    //         return s;
    // }
    public int maxRotateFunction(int[] nums) 
    {
        int n=nums.length,ans=Integer.MIN_VALUE,s=0,m=0;
        for(int i=0;i<n;i++)
        {
            // int s=0;
            // ans=Math.max(leftrotation(nums[n-1],nums),ans);
            s+=nums[i];
            m+=(nums[i]*i);
        }
        ans=Math.max(m,ans);
        for(int i=0;i<n;i++)
        {
            
            int la=nums[n-i-1]*(n-1);
            int tot=s-nums[n-i-1];
            m=m-la;
            m+=tot;
            ans=Math.max(m,ans);
        }
        return ans;
    }

}