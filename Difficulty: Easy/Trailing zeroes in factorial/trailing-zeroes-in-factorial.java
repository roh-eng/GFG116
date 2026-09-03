class Solution {
     public static int trailingZeroes(int n) {
         int count = 0;

         // Count how many multiples of 5, 25, 125, ... are in [1, n]
         for (long divisor = 5; divisor <= n; divisor *= 5) {
             count += n / divisor;
         }

         return count;
     }
 }