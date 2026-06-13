class Solution {
    public boolean checkDivisibility(int n) {
        int s=0,p=1,co=n;
        while(co>0)
        {
            int d=co%10;
            s+=d;
            p*=d;
            co/=10;
        }
        return (n%(s+p)==0);
    }
}