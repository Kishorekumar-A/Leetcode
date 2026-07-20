class Solution {
    public String largestMerge(String word1, String word2) {
        int i=0,j=0,n=word1.length(),m=word2.length();
        StringBuilder re=new StringBuilder();
        // while(i<n&&j<m)
        // {

        //     if(word1.charAt(i)<word2.charAt(j))
        //     {
        //         re+=word2.charAt(j);
        //         j++;
        //     }
        //     else if(word1.charAt(i)==word2.charAt(j))
        //     {
        //         if(n-i>m-j)
        //         {
        //             re+=word1.charAt(i);
        //             i++;
        //         }
        //         else
        //         {
        //             re+=word2.charAt(j);
        //             j++;
        //         }
        //     }
        //     else
        //     {
        //         re+=word1.charAt(i);
        //         i++;
        //     }
        //     System.out.println(re);
        // }

        while(i<n&&j<m)
        {
            String w1=word1.substring(i,n);
            String w2=word2.substring(j,m);
            if(w1.compareTo(w2)<0)
            {
                re.append(word2.charAt(j));
                j++;
            }
            else
            {
                re.append(word1.charAt(i));
                i++;
            }
        }
        while(i<word1.length())
        {
            re.append(word1.charAt(i));
            i++;
        }
        while(j<word2.length())
        {
            re.append(word2.charAt(j));
            j++;
        }
        return re.toString();
    }
}