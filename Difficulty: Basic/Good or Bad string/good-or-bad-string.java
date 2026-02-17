class Solution {
    
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    
    public static int isGoodorBad(String S) {
        int vowelCount = 0;
        int consonantCount = 0;
        
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            
            if (ch == '?') {
                vowelCount++;
                consonantCount++;
            } else if (isVowel(ch)) {
                vowelCount++;
                consonantCount = 0;
            } else {
                consonantCount++;
                vowelCount = 0;
            }
            
            if (vowelCount > 5 || consonantCount > 3) {
                return 0;
            }
        }
        
        return 1;
    }
    

}