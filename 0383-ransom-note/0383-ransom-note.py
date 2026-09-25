class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        di={}
        for ch in magazine:
            di[ch]=di.get(ch,0)+1

        for c in ransomNote:
            if(c not in di or di[c]==0):
                return False
            di[c]-=1

        return True