class Solution {
    public long maxSum(Long[] arr) {
        Arrays.sort(arr);
        Long[] rearranged = new Long[arr.length];
        int left = 0, right = arr.length - 1;
        
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                rearranged[i] = arr[left++];
            } else {
                rearranged[i] = arr[right--];
            }
        }
        
        long sum = 0;
        for (int i = 0; i < rearranged.length; i++) {
            int next = (i + 1) % rearranged.length; 
            sum += Math.abs(rearranged[i] - rearranged[next]);
        }
        
        return sum;
    }
}