class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        
        Set<Integer> li=new HashSet<>();
       for(int i=1;i<bound;i*=x)
       {
        for(int j=1;j<bound;j*=y)
        {
            int s=i+j;
            if(s<=bound) li.add(s);
            else
            {
                break;
            }
            if(y==1) break;
        }
        if(x==1) break;
       }

        return new ArrayList<>(li);
    }
}