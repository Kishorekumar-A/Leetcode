class Solution {
    public int largestInteger(int[] nums, int k) {
        List<Integer> li=new ArrayList<>();
        int m=0;
        for(int i:nums)
        {
            if(!li.contains(i)) li.add(i);
            m=Math.max(m,i);
        }
        if(nums.length==k) return m;
        int fr[]=new int[li.size()];
        for(int i=0;i<nums.length-k+1;i++)
        {
            for(int j=i;j<k+i;j++)
            {
                if(li.contains(nums[j]))
                {
                    fr[li.indexOf(nums[j])]++;
                }
            }
        }
        int max=-1;
        for(int i=0;i<fr.length;i++)
        {
            if(fr[i]==1)
            {
                max=Math.max(li.get(i),max);
            }
        }
        return max;
    }
}