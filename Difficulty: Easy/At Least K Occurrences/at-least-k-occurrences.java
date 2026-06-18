import java.util.*;

class Solution {
    public int firstElementKTime(int[] arr, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int num : arr) {
            int currentcount= freq.getOrDefault(num, 0) + 1;
            freq.put(num,currentcount);
            if(currentcount==k){
                return num;
            }
            
        }
        
        
        
        return -1;
    }
}