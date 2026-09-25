class Solution(object):
    def maximumWealth(self, accounts):
        """
        :type accounts: List[List[int]]
        :rtype: int
        """
        s=0
        ans=0
        for i in accounts:
            s=max(sum(i),s)
            # print(i)
        return s
        