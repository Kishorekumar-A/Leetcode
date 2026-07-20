class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid.length,m=grid[0].length;
        k=k%(m*n);
        for(int h=0;h<k;h++)
        {
            int te=grid[n-1][m-1];
                int temp=0;
            for(int i=0;i<grid.length;i++)
            {
                if(m>1){
                for(int j=0;j<grid[i].length-1;j++)
                {
                    if(j!=0)
                    {
                        temp=grid[i][j+1];
                        grid[i][j+1]=te;
                        te=temp;
                    }
                    else{
                     temp=grid[i][j+1];
                    grid[i][j+1]=grid[i][j];
                    grid[i][j]=te;
                    te=temp;

                    }
            // System.out.println(Arrays.toString(grid[i]));
                }
            }
            else
            {
                temp=grid[i][0];
                grid[i][0]=te;
                te=temp;
            }
            }
           
        }
        List<List<Integer>> re=new ArrayList<>();
        for(int i=0;i<grid.length;i++)
        {
            List<Integer> li=new ArrayList<>();
            for(int j=0;j<grid[i].length;j++)
            {
                li.add(grid[i][j]);
            }
            re.add(li);
        }    
        return re;
    }
}