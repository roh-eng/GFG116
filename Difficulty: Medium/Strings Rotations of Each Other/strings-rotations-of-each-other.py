class Solution:
    def areRotations(self, s1, s2):
        # code here
        # c1=0
        # c2=0
        # for char in s2:
        #     if char in s1:
        #         c1+=1
        # for char in s1:
        #     if char in s2:
        #         c2+=1
        
        if len(s1)!=len(s2):
                return False
        return s2 in(s1+s1)