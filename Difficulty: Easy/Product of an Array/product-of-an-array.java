class Solution {
    public static long product(long arr[]) {
        long MOD = 1000000007;
        long product = 1;
        for (int i = 0; i < arr.length; i++) {
            product = (product * arr[i]) % MOD;  
        }
        return product;
    }
}

