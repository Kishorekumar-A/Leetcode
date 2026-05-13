class Solution {
    public boolean isSubsequence(String s, String t) {
        int in=0;
        for(int i=0;i<s.length();i++)
        {
         boolean f=false;   
            for(int j=in;j<t.length();j++)
            {
                if(s.charAt(i)== t.charAt(j))
                {
                    f=true;
                    in=j+1;
                    break;
                }
            }
            if(!f) return false;
        }
        return true;
    }
}