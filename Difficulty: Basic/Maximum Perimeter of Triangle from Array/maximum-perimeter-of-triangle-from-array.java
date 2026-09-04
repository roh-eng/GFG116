class Solution {
    public int maxPerimeter(int[] arr) {
        // code here
        int n=arr.length;
        if(n<3) return -1;
        Arrays.sort(arr);
        for(int k=n-1;k>=2;k--){
            if(arr[k-2]+arr[k-1]>arr[k]){
                return arr[k-2]+arr[k-1]+arr[k];
            }
        }
        return -1;
    }
}