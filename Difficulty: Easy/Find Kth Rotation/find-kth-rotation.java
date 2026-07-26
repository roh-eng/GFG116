class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int min = arr[0], minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}