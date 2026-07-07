class Solution {
    static int evenlyDivides(int n) {
        // code here
        int count=0;
        int x=n;
        ArrayList<Integer> res=new ArrayList<>();
        while(n!=0){
            int last=n%10;
            res.add(last);
            n=n/10;
        }
        for (int digit : res) {
            if (digit != 0 && (x % digit) == 0) {
                count++;
            }
        }
        return count;
        
    }
}