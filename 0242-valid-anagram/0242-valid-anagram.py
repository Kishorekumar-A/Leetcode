class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if (len(s)!=len(t)):
            return False
        di1={}
        di2={}
        for c in s:
            di1[c]=di1.get(c,0)+1
        for c in t:
            di2[c]=di2.get(c,0)+1

        for c in s:
            if(c not in di2):
                return False
            if(di1[c]!=di2[c]):
                return False
            di1[c]-=1
            di2[c]-=1
        return True

