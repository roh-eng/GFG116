class Solution {
    int maxPeopleDefeated(int p) {
        // code here
        int count=0;
        int i=1;
        while(p>=(i*i)){
                p=p-(i*i);
                
            
            count++;
            i++;
        }
        return count;
    }
};