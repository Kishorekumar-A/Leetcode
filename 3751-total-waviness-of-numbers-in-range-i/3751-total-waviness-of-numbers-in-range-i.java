class Solution {
    public int totalWaviness(int num1, int num2) {
        if(num1<100&&num2<100) return 0;

        int c=0;
        for(int i=num1;i<=num2;i++)
            {
                String n=String.valueOf(i);
                for(int j=1;j<n.length()-1;j++)
                    {
                        if(n.charAt(j)>n.charAt(j-1)&&n.charAt(j)>n.charAt(j+1)) c++;

                        else if(n.charAt(j)<n.charAt(j-1)&&n.charAt(j)<n.charAt(j+1)) c++;
                    }
            }
        return c;
    }
}