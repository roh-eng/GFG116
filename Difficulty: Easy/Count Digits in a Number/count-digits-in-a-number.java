class Solution {
    public static int countDigits(int n) {
        // Code here
        int c=0;
        while(n!=0){
            int last=n%10;
            c+=1;
            n=n/10;
        }
        return c;
    }
}
