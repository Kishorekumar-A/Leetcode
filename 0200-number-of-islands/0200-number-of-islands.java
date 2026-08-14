class Solution {
    private void find(char[][] grid,int i,int j)
    {
        Queue<int[]> q=new LinkedList();
        int n=grid.length;
        int m=grid[0].length;
        int dir[][]={{-1,0},{0,1},{1,0},{0,-1}};
        q.add(new int[]{i,j});
        while(!q.isEmpty())
        {
            int [] curr=q.poll();
            int r=curr[0];
            int c=curr[1];
            for(int d[]:dir)
            {
                int nr=r+d[0];
                int nc=c+d[1];
                
                if(nr>=0&&nc>=0&&nr<n&&nc<m&& grid[nr][nc]=='1')
                {
                    grid[nr][nc]='0';
                    q.add(new int[]{nr,nc});
                }
            }
        }

    }
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    find(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
}