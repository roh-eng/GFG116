class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int sum=0;
        int x=n;
        while(n!=0){
            int last =n%10;
            sum=sum+(int)Math.pow(last,3);
            n=n/10;
        }
        if(x==sum){
            return true;
        }
        return false;
    }
}