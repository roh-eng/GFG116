class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here'
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            if(i==0){
                arr[i]=i;
            }else if(i==1){
                arr[i]=1;
            }else{
                arr[i]=arr[i-2]+arr[i-1];
            }
        }
        return arr;
    }
}