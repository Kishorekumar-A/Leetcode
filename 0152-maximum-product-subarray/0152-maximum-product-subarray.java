class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0],re=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            int m=1;
            for(int j=i;j<nums.length;j++)
            {
                m*=nums[j];
            re=Math.max(re,m);
            }
        }
        return re;
    }
}