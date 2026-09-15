class Solution:
    def removeDuplicates(self, s):
        # code here
        ans = " "
        for i in s:
            if i != ans[-1]:
                ans += i
        return ans[1:]