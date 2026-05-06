class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) 
    {
        char ans[][] = new char[boxGrid[0].length][boxGrid.length];

        // for(int i=0;i<boxGrid.length;i++)
        // {
        //     for(int j=0;j<boxGrid[0].length;j++)
        //     {
        //         ans[j][i]=boxGrid[i][j];
        //     }
        // }

        for(int i=0;i<boxGrid.length;i++)
        {
            int c=0;
            for(int j=0;j<boxGrid[0].length;j++)
            {
                if(boxGrid[i][j]=='#')
                {
                    c++;
                }
                if(boxGrid[i][j]=='*') {
                    c=0;
                    continue;
                }
                if(boxGrid[i][j]=='.'&&c>0)
                {
                    int s=i,e=j,k=c;

                    while(k>0)
                    {
                         char t=boxGrid[s][e];
                        boxGrid[s][e]=boxGrid[s][e-1];
                        boxGrid[i][e-1]=t;
                        k--;
                        e--;
                    }
                }
            }
        }
         for(int i=0;i<boxGrid.length;i++)
        {
            for(int j=0;j<boxGrid[0].length;j++)
            {
                ans[j][boxGrid.length-1-i]=boxGrid[i][j];
            }
        }
        // for(int i=0;i<boxGrid[0].length;i++)
        // {
        //     Arrays.fill(ans[i],'x');
        // }
        
        return ans;
    }
}