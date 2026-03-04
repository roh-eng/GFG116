class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        if (arr.length < k) return -1;

        int currentXor = 0;

        for (int i = 0; i < k; i++) {
            currentXor ^= arr[i];
        }

        int max = currentXor;

        for (int i = k; i < arr.length; i++) {
            currentXor ^= arr[i - k];  
            currentXor ^= arr[i];     
            max = Math.max(max, currentXor);
        }

        return max;
    }
}