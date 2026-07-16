class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int sum=0;
       for(int i=0;i<k;i++) sum+=nums[i];
       int m=sum;
       for(int i=0;i<nums.length-k;i++)
       {
        System.out.println(sum);
        sum-=nums[i];
        sum+=nums[k+i];
        m=Math.max(m,sum);
       }
       return (double)m/k;
    }
}