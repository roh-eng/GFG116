import java.util.*;
class Solution {
    public static int leftElement(int[] arr) {
        // code here
        Arrays.sort(arr);
        int low=0;
        int high=arr.length-1;
        int mid=(low+high)/2;
        return arr[mid];
    }
}
