class Solution:
    def roundToNearest(self, s):

        if int(s[-1]) <= 5:
            return s[:-1] + '0'

        arr = list(s[:-1])
        i = len(arr) - 1

        while i >= 0 and arr[i] == '9':
            arr[i] = '0'
            i -= 1

        if i >= 0:
            arr[i] = str(int(arr[i]) + 1)
        else:
            arr.insert(0, '1')

        return "".join(arr) + '0'