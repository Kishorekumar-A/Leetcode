class Solution {
    public List<List<Integer>> ans=new ArrayList<>();
    public  void perm(List<Integer> c,int [] nums,boolean visit[])
    {
        if(c.size()==nums.length)
        {
            ans.add(new ArrayList(c));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(visit[i]) continue;
            c.add(nums[i]);
            visit[i]=true;
            perm(c,nums,visit);
            c.remove(c.size()-1);
            visit[i]=false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> cu=new ArrayList<>();
        perm(cu,nums,new boolean[nums.length]);
        return ans;
    }
}