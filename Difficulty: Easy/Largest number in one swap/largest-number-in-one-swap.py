class Solution:
    def largestSwap(self, s):
        x = list(s)
        n = len(x)

        last = {}
        for i in range(n):
            last[x[i]] = i

        for i in range(n):
            for d in range(9, int(x[i]), -1):
                if str(d) in last and last[str(d)] > i:
                    j = last[str(d)]
                    x[i], x[j] = x[j], x[i]
                    return "".join(x)

        return s