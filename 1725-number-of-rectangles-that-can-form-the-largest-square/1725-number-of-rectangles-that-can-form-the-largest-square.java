class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int min=Integer.MIN_VALUE,c=0;
        int re[]=new int[rectangles.length];
        boolean view[]=new boolean[rectangles.length];

        for(int i=0;i<rectangles.length;i++)
        {
            int m=Math.min(rectangles[i][0],rectangles[i][1]);
            // re[i]=m;
            if(min<m)
            {
                min=m;
                c=1;
            }
            else if( m==min) c++;

        }
      
        // System.out.println(Arrays.toString(re));
        return c;
    }
}