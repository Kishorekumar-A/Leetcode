class Solution {
    public String processStr(String s) {
        StringBuilder re=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='#'&&re.length()>=1)
            {
                re.append(re);
            }
            else if(c=='%'&&re.length()>=1)
            {
                String r=re.reverse().toString();
                re.replace(0,re.length(),r);
            }
            else if(c=='*'&&re.length()>=1)
            {
                re.deleteCharAt(re.length()-1);
            }
            else if(Character.isLetter(c))
            {
                re.append(c);
            }
        }
        return re.toString();
    }
}