class Solution {
    public int maximumDifference(int[] nums) {
        int mi=-1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    int d=nums[j]-nums[i];
                    mi=Math.max(d,mi);
                }
            }
        }
        return mi;
    }
}