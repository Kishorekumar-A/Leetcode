class Solution {
    public List<List<Integer>> result=new ArrayList<>();
    public void dfs(List<Integer> path, int val,int [][]graph)
    {
        path.add(val);
        if(val==graph.length-1)
        {
            // System.out.print(path);
            result.add(new ArrayList(path));
            return;
        }
        for(int n:graph[val])
        {
            dfs(path,n,graph);
            path.remove(path.size()-1);
        }

    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
       
        List<Integer> path=new ArrayList<>();
        dfs(path,0,graph);
       return result;

    }
}