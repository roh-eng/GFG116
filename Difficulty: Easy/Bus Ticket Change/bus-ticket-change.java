class Solution {
    public boolean canServe(int[] arr) {
        int f=0;
        int t=0;
        int tw=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==5){
                f++;
            }
            if(arr[i]==10){
                if(f>0){
                f--;
                }else {
                    return false;
                    
                }
                t++;
            }
                if (arr[i] == 20) {
        if (t > 0 && f > 0) {
            // give one 10 and one 5
            t--;
            f--;
        } else if (f >= 3) {
            // give three 5s
            f -= 3;
        } else {
            return false;
        }
    }
        }
        return true;
        
    }
}