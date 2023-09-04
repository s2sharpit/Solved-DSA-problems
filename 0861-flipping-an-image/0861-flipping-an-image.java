class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int col = image[0].length;
        int[][] result = new int[row][col];

        // Step 1: revert
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = image[i][col - j - 1];
            }
        }

        // Step 2: invert
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = result[i][j] == 1 ? 0 : 1;
            }
        }

        return result;
    }
}