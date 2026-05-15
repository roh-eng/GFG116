class Solution {
    public int maxProfit(int m, int[] arr) {
        Arrays.sort(arr);
        
        int profit = 0;
        int count = 0;
        
        for (int i = 0; i < arr.length && count < m; i++) {
            if (arr[i] < 0) {
                profit += Math.abs(arr[i]);
                count++;
            } else {
                break;
            }
        }
        return profit;
    }
}