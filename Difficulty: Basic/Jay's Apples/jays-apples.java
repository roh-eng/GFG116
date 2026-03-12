// User function Template for Java
import java.util.*;
// User function Template for Java

class Solution {
    public int minimumApple(int[] arr) {
        // Complete the function
        HashSet<Integer> hs=new HashSet<>();
            for(int num:arr){
                hs.add(num);
            }
        
        return hs.size();
    }
}
