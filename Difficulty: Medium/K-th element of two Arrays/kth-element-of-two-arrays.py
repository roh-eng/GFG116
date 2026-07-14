class Solution:
    def kthElement(self, a, b, k):
        # code here
        x=a+b
        x.sort()
        # low=0
        # high=len(x)-1
        # mid=low+(high-low)/2
        # while low<high:
        #     if mid<k:
        #         high=mid-1;
        #     elif mid>k:
        #         low=mid+1;
            
        # low=low+1
        # high=high-1
        # return x[mid] 
        return x[k - 1]
            