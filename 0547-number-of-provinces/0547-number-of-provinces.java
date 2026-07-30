class Solution {
    //   List<List<Integer>> graph=new ArrayList<>();
    //     List<Integer> connect=new ArrayList<>();
    //     int i=0, k=0,in=0;;
    //    while(in<isConnected.length){
    //    if(!connect.isEmpty())
    //    {
        
    //     i=connect.get(in);
    //    }
    //    else i=in;
    //    boolean added=false;
    //    int c=0;
    //         for(int j=0;j<isConnected.length;j++)
    //         {
                
    //             if(isConnected[i][j]==1&&!connect.contains(j))
    //             {
    //                 connect.add(j);

    //             c++;
    //             }
    //             if(c>1) added=true;
    //         }
    //         i++;
    //         in++;
    //         if(!added)
    //         {
    //             connect.clear();
    //             k++;
    //         System.out.println(connect+" "+in);
    //         }
    //     }
    //     return k;
    public void checkVisit(int [][]isConnected, boolean[]visited,int i)
    {
        visited[i]=true;
        for(int j=0;j<isConnected.length;j++)
        {
            if(!visited[j]&&isConnected[i][j]==1)
            {
                checkVisit(isConnected,visited,j);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
      int n=isConnected.length;
      boolean visited[]=new boolean[n];
      int c=0;
      for(int i=0;i<n;i++)
      {
        if(!visited[i])
        {
            checkVisit(isConnected,visited,i);
            c++;
        }
      }
      return c;
    }
}