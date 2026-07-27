class Solution {
    public int findCenter(int[][] edges) {
        int fr[]=new int[edges.length+2];
        for(int i=0;i<edges.length;i++)
        {
            fr[edges[i][0]]++;
            fr[edges[i][1]]++;
        }
        int in=0,m=fr[0];
        for(int i=0;i<fr.length;i++)
        {
            if(fr[i]>m)
            {
                in=i;
                m=fr[i];
            }
        }
        // System.out.print(Arrays.toString(fr));
        return in;
    }
}