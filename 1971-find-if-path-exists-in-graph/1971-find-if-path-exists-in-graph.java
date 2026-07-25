class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(edges.length<=0) return true;
        // int graph[][]=new int[n][n];

        ArrayList<Integer> graph[]=new ArrayList[n];
        boolean vi[]=new boolean[n];

        for(int i=0;i<n;i++)
        {
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<edges.length;i++)
        {

            int s=edges[i][0],e=edges[i][1];

            graph[s].add(e);
            graph[e].add(s);
        }
        Queue<Integer> q=new LinkedList<>();
        q.add(source);
        vi[source]=true;
        while(!q.isEmpty())
        {
            int c=q.poll();
            for(int p:graph[c])
            {
                if(p==destination) return true;
                if(!vi[p])
                {
                    q.add(p);
                    vi[p]=true;
                }
            }
            
        }
        return false;
    }
}