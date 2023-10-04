class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] row : grid)
            count += binarySearch(row);
        return count;
    }

    int binarySearch(int[] row) {
        int start = 0, end = row.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (row[mid] < 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return row.length - start;
    }
}