class Solution:
    def factorial(self, n):
        #code here
        s=1
        for i in range(1,n+1):
            s*=i
        res=[]
        while s>0:
            last=s%10
            res.append(last)
            s=s//10
        res.reverse()
        return res