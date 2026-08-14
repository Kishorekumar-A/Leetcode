class Solution {
    // private void dfs(List<List<Integer>> rooms,boolean visit[])
    // {

    // }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visit[]=new boolean[rooms.size()];
        int ind=0;
        // visit[rooms.get(0).get(0)]=true;
        // visit[ind]=true;
        Queue<Integer> q=new LinkedList();
        visit[0]=true;
        for(int i=0;i<rooms.get(0).size();i++)
        {
            q.add(rooms.get(0).get(i));
            visit[rooms.get(0).get(i)]=true;
        }
        while(!q.isEmpty())
        {
            int c=q.poll();
            visit[c]=true;
            for(int i:rooms.get(c))
            {
                if(!visit[i])q.add(i);
            }
            
        }
        // System.out.println(Arrays.toString(visit));
        for(boolean c:visit)
        {
            if(c==false) return false;
        }
        return true;
    }
}