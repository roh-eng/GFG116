import java.util.*;
class Solution {
    // Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high) {
        // Your code here
        Arrays.sort(arr);
        low=0;
        high=arr.length-1;
        int small=Integer.MAX_VALUE;;
        while(low<=high){
            int mid=(low+(high-low))/2;
            if(arr[mid]<small){
                small=arr[mid];
                high=mid-1;
                
            }else if(arr[mid]>arr[low]){
                low=mid+1;
                small=arr[mid];
            }
        }
        return small;
    }
}