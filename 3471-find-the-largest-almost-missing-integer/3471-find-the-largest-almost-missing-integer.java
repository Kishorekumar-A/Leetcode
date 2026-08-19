class Solution {
    public int largestInteger(int[] nums, int k) {
        // int f=nums[0],l=nums[nums.length-1];
        // boolean lf=true,ff=true;
        // for(int i=1;i<nums.length-1;i++)
        // {
        //     if(nums[i]==f) ff=false;
        //     if(nums[i]==l) lf=false;
        // }
        // if(lf&&ff)
        // {
        //     if(k==1&&l==f) return -1;
            
        //     // return -1;
        // }
        // if(!ff&&lf) return l;
        // if(ff&&!lf) return f;
        // return(l>=f)? l: f;

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
                    // System.out.print(nums[j]+" ");
                    fr[li.indexOf(nums[j])]++;
                }
            }
        }
                // System.out.println(li);
        int max=-1;
        System.out.println(Arrays.toString(fr));
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