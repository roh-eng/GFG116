import java.util.*;

class Solution {
    static int minTime(int S1, int S2, int N) {
        long low = 0;
        long high = (long) N * Math.min(S1, S2);
        long result = high;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            
            long ds1 = mid / S1;
            long ds2 = mid / S2;

            if (ds1 + ds2 >= N) {
                result = mid;
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }

        return (int) result;
    }
}