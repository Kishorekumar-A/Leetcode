class Solution {
    public String reverseWords(String s) {
        String re="";
        String [] li=s.split(" ");

        for(int i=0;i<li.length;i++)
        {
            StringBuilder st=new StringBuilder(li[i]);
            String v=st.reverse().toString();
            re= re+v+" ";
        }
        return re.trim();
    }
}