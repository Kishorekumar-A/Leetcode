class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int in=-1,mi=Integer.MAX_VALUE,n=words.length;
        for(int i=0;i<n;i++)
        {
            if(target.equals(words[i]))
            {
                int v=Math.abs(startIndex-i);
                mi=Math.min(Math.min(v,n-v),mi);
            }
        }
        return (mi==Integer.MAX_VALUE)?-1:mi;
    }
}