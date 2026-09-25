class Solution(object):
    def runningSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        s=nums[0]
        result=[1]*len(nums)
        result[0]=nums[0]
        for i in range(1,len(nums)):
            s+=nums[i]
            result[i]=s
        return result
        