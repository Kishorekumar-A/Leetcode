class Solution {
    public int product(int n)
    {
        int p=1;
        while(n>0)
        {
            p*=n%10;
            n/=10;
        }
        return p;
    }
    public int smallestNumber(int n, int t) {
        while(n<=100)
        {
            if(product(n)%t==0) return n;
            else
            {
                n++;
            }
        }
       return 0; 
    }
}