class Solution {
    // static boolean isPrime(int n) {
    //     if (n < 2) return false;
    //     if (n == 2) return true;
    //     if (n % 2 == 0) return false;

    //     for (int i = 3; i * i <= n; i += 2) {
    //         if (n % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    static int largestPrimeFactor(int n) {
        if (n <= 1) return -1; 
        int max = -1;

        while (n % 2 == 0) {
            max = 2;
            n = n / 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                max = i;
                n = n / i;
            }
        }

        if (n > 1) {
            max = n;
        }

        return max;
    }
}