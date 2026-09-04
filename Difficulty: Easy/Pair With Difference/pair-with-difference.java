
class Solution {
    public boolean findPair(int[] arr, int x) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int low=0;
        int high=1;
        while(high<n){
            int diff=arr[high]-arr[low];
            if(diff<x){
                high++;
            }else if(diff==x){
                return true;
                
            }else{
                low++;
                if(low==high){
                    high++;
                }
            }
        }
        return false;
    }
}
