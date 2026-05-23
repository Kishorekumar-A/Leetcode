class Solution {
    public boolean check(int[] nums) {
        boolean le=false,fa=false;
            int ar[]=Arrays.copyOf(nums,nums.length);
            Arrays.sort(ar);
        for(int i=0;i<nums.length;i++)
        {
            if(Arrays.equals(ar,nums))
            {
                return true;
            }
            int f=nums[0];
            for(int j=1;j<nums.length;j++)
            {
                nums[j-1]=nums[j];
            }
            nums[nums.length-1]=f;
        }
        return false;
    }
}