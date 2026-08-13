class Solution {
    public int minSwapsCouples(int[] row) {
        int c=0;
        for(int i=0;i<row.length;i+=2)
        {
            int val=row[i]^1;
            if(val!=row[i+1])
            {
                int j=i;
                // int in=-1;
                while(j<row.length &&val!=row[j])
                {
                    j++;
                } 
                // j--;
                int t=row[i+1];
                row[i+1]=row[j];
                row[j]=t;
                c++;
                System.out.println(Arrays.toString(row));
            }
        }
        return c;
    }
}