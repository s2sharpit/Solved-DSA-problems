class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];

        for (int[] index: indices) {
            row[index[0]]++;
            col[index[1]]++;
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                count += (row[i] + col[j]) % 2;
            }
        }
        return count;
    }
}