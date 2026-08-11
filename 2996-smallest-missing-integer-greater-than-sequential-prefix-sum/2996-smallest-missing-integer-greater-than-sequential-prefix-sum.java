class Solution {
    public int missingInteger(int[] nums) {
        int in=0,sum=nums[0];
        List<Integer> li=new ArrayList<>();
        for(int i:nums)li.add(i);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]+1==nums[i]) 
            {
                sum+=nums[i];
            
            }else
            {
                // sum+=nums[i-1];
                break;
            }
            
        }
        while(true)
        {
            if(li.contains(sum)) sum++;
            else return sum;
        }
        // return sum;
    }
}