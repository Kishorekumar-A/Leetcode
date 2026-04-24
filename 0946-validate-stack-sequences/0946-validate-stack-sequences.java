class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> pu=new Stack<>();
        // Stack<Integer> po=new Stack<>();
        int n=pushed.length,j=0;
        // for(int i=0;i<n;i++)
        // {
        //     if(pushed[i]==pushed[j])
        //     {
        //         while(!pu.isEmpty()&&pu.)
        //     }
        //     else
        //     {
        //         pu.push(pushed[i]);
        //     }
        // }
        for(int i=0;i<n;i++)
        {
            boolean wh=false;
            if(pushed[i]==popped[j])
            {
                pu.push(pushed[i]);
                while(!pu.isEmpty()&&pu.peek()==popped[j])
                {
                    wh=true;
                    pu.pop();
                    j++;
                }
                if(!wh) j++;
            }
            else
            {
                pu.push(pushed[i]);
                // System.out.println(pu);
            }
        }
        while(!pu.isEmpty()&&pu.peek()==popped[j])
                {
                    pu.pop();
                    j++;
                }
                // System.out.println(pu);
        return pu.isEmpty();
    }
}