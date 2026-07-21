class Solution {
    public int lengthOfLongestSubstring(String s) {
        int c=0;

        for(int i=0;i<s.length();i++)
        {
            StringBuilder st=new StringBuilder();
            st.append(s.charAt(i));
            for(int j=i+1;j<s.length();j++)
            {
                if(st.toString().indexOf(""+s.charAt(j))!=-1){ 
                    break;
                    }
                else st.append(s.charAt(j));
            }
                    // System.out.println(st.toString());
            c=Math.max(st.length(),c);
        }
        return c;
    }
}