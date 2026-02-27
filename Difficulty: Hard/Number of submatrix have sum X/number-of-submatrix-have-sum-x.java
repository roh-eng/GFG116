class Solution {
    public int countSquare(int[][] mat, int x) {
        int n = mat.length;
        int m = mat[0].length;
        int count = 0;

        for (int size = 1; size <= Math.min(n, m); size++) {  // square size
            for (int i = 0; i <= n - size; i++) {
                for (int j = 0; j <= m - size; j++) {

                    int sum = 0;

                    for (int r = i; r < i + size; r++) {
                        for (int c = j; c < j + size; c++) {
                            sum += mat[r][c];
                        }
                    }

                    if (sum == x) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}