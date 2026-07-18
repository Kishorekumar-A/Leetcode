class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int mi=nums[0],ma=nums[nums.length-1];
        while(ma!=0)
        {
            int t=ma;
            ma=mi%ma;
            mi=t;
        }
        return mi;
    }
}