def is_palindrome(n):
    if n < 0:
        return False
    original = n
    rev = 0
    while n > 0:
        digit = n % 10
        rev = rev * 10 + digit
        n = n // 10
    return original == rev

def isPalinArray(arr):
    for num in arr:
        if not is_palindrome(num):
            return False
    return True