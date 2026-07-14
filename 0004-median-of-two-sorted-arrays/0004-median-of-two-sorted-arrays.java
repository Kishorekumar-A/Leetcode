class Solution {
    public double findMedianSortedArrays(int[] ar1, int[] ar2) {
         int n1=ar1.length,n2=ar2.length,i=0,j=0,k=0;
        int re[]=new int[n1+n2];
        while(i<n1&&j<n2)
        {
            if(ar1[i]<=ar2[j])
            {
                re[k++]=ar1[i];
                i++;
            }
            else if(ar1[i]>=ar2[j])
            {
                re[k++]=ar2[j];
                j++;
            }
        }
        while(i<n1) re[k++]=ar1[i++];
        while(j<n2) re[k++]=ar2[j++];
        double me=-1;
        int mid=(n1+n2)/2;
        if((n1+n2)%2==0)
        {
            me=((double)(re[mid]+re[mid-1]))/2;
        }
        else{
            me=re[mid];
        }
        
        return me;
    }
}