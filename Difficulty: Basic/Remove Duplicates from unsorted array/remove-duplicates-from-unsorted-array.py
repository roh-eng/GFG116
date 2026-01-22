class Solution:
    def removeDuplicate(self, arr):
        seen = set()
        res = []
        for num in arr:
            if num not in seen:
                res.append(num)
                seen.add(num)
        return res