#User function Template for python3
class Solution:
	def removeDups(self, str):
		# code here
		s=str.split()
		res=[]
		for i in str:
		    if i not in res:
		        res.append(i)
        return ''.join(res)