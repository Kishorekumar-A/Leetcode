class Solution {
    public boolean digitCount(String num) {
        int fr[]=new int[10];
        // int n=Integer.valueOf(num);
        // int i=num.length()-1,nu=n;

        // while(nu>0)
        // {
        //     int d=nu%10;
        //     fr[d]++;
        //     nu/=10;
        // }
        // while(n>0)
        // {
        //     int d=n%10;
        //     if(i!=fr[d]) return false;
        //     i--;
        //     n/=10;
        // }
        for(int i=0;i<num.length();i++)
        {
            int n=num.charAt(i)-'0';
            fr[n]++;
        }
        // System.out.println(Arrays.toString(fr));
        int k=0;
        for(int i=0;i<num.length();i++)
        {
            int n=num.charAt(i)-'0';
            // System.out.println(n+" " +fr[n]);
            if(n!=fr[k++]) return false;
        }

        return true;
    }
}