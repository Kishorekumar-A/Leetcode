class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder st=new StringBuilder(num);
       st.reverse();
      
        while(st.charAt(0)=='0') {
           st.deleteCharAt(0);
            }
        
      
      String s=st.reverse().toString();
       return s;
    }
}