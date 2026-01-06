/*Class solution with countOddEven() as its member function
 * arr : input array
 */
class Solution {
    public static void countOddEven(Integer arr[]) {

        // Your code here
        int c=0;
        int z=0;
        for(int i:arr){
            if(i%2==0){
                c++;
            }else{
                z++;
            }
        }
        System.out.println(z+" "+c);
    }
}