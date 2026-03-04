import java.util.*;

class Solution {
    // Function to check if a string is Isogram or not.
    static boolean isIsogram(String data) {
        // Your code here
        if(data==null) return false;
        Set<Character> seen = new HashSet<>();
        data=data.toLowerCase();
        for(char ch:data.toCharArray()){
            if(Character.isLetter(ch)){
                if(seen.contains(ch)){
                    return false;
                }
                seen.add(ch);
            }
        }
        return true;
    }
}