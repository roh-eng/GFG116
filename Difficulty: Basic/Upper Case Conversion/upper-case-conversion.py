#User function Template for python3

class Solution:
    def convert(self, s):
        # code here
        z=s.split()
        q=[]
        for i in z:
            q.append(i.capitalize())
        return ' '.join(q)