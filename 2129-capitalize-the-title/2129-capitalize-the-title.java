class Solution {
    public String capitalizeTitle(String title) {
        String st[]=title.split(" ");
        String ans="";
        for(String s:st)
        {
            if(s.length()<=2)
            {
                String w=s.toLowerCase();
                ans+=w;
                ans+=" ";
            }
            else
            {
                String w=s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
                
                ans+=w;
                ans+=" ";
            }
        }
        // System.out.println(Arrays.toString(st));
        return ans.trim();
    }
}