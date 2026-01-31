#User function Template for python3


class Solution:
    def modify(self, s):
        
        if ord(s[0])>=65 and ord(s[0])<=91:
            return s.upper()
        else:
            return s.lower()