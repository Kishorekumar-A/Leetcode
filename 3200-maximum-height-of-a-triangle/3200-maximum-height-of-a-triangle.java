class Solution {
    public int height(int c1,int c2)
    {
        int i=1,co=0;
        while(c1>0||c2>0)
        {
            c1-=i;
            i++;
            if(c1>=0&&c2>=0) co++;
            c2-=i;
            i++;
            if(c2>=0&&c1>=0) co++;

        }
        return co;
    }
    public int maxHeightOfTriangle(int red, int blue) {

       return Math.max(height(red,blue),height(blue,red)); 
    }
}