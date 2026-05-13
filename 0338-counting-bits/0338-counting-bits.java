class Solution {
    public int[] countBits(int n) {
        int re[]=new int[n+1];
        while(n>-1)
        {
           
            re[n]=Integer.bitCount(n);
            n--;
        }
        return re;
    }
}