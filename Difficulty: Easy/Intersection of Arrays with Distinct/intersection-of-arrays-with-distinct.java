import java.util.HashSet;

class Solution {
    public static int intersectSize(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : a) {
            set.add(x);
        }

        int count = 0;
        for (int y : b) {
            if (set.contains(y)) {
                count++;
                set.remove(y); 
            }
        }
        return count;
    }
}
