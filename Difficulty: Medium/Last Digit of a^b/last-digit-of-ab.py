import math

class Solution:
    def getLastDigit(self, a, b):
        
        base = int(a) % 10
        
        return pow(base, int(b), 10)