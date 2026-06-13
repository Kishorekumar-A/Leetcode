class Solution {
    public void swap(int []nums,int i,int j)
    {
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
   
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(i%2==0&&nums[i]%2!=0)
            {
                int j=i;
                while(nums[j]%2!=0)
                {
                    j++;
                }
                swap(nums,i,j);
            }
            if(i%2!=0&&nums[i]%2==0)
            {
                int j=i;
                while(nums[j]%2==0)
                {
                    j++;
                }
                swap(nums,i,j);
            }

        }
        return nums;
    }
}