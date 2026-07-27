class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length<n-1) return -1;
        int fr[]=new int[n+1];
        int jj []=new int[n+1];
        // HashSet<Integer> se=new HashSet<>();
        for(int i=0;i<trust.length;i++)
        {
            fr[trust[i][1]]++;
            jj[trust[i][0]]++;
        }
        // System.out.println(Arrays.toString(fr)+" "+se.size());
        for(int i=1;i<fr.length;i++)
        {
            if(fr[i]==n-1&&jj[i]==0) return i;
        }
        return -1;
    }
}