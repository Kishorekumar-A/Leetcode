import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int re[]=new int[k];
        int in=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int i=0;i<k;i++)
        {
             Map.Entry<Integer, Integer> maxEntry = Collections.max(
            map.entrySet(), 
            Map.Entry.comparingByValue()
        );
        int m=maxEntry.getKey();
            re[i]=m;
            map.remove(m);
        }
        // System.out.println(map);
    return re;
    }
}