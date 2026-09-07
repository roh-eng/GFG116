class Solution:
    # Function to remove all occurrences of the character from the string
    def removeCharacter(self, s, c):
        # code her
        r=[]
        for ch in s:
            if ch!=c:
                r.append(ch)
        return "".join(r)