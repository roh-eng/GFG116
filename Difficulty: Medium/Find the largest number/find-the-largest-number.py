class Solution:
    def find(self, N):
        digits = list(str(N))
        n = len(digits)

        marker = n

        for i in range(n - 1, 0, -1):
            if digits[i] < digits[i - 1]:
                digits[i - 1] = str(int(digits[i - 1]) - 1)
                marker = i

        for i in range(marker, n):
            digits[i] = '9'

        return int("".join(digits))
