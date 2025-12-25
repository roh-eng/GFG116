class Solution {
    public long minOperations(int N) {
        long half1 = N / 2;
        long half2 = (N + 1) / 2;
        return half1 * half2;
    }
}