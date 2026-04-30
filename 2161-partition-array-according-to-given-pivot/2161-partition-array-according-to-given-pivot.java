class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int re[]=new int[nums.length],j=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<pivot) re[j++]=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==pivot) re[j++]=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>pivot) re[j++]=nums[i];
        }

    return re;
    }
}