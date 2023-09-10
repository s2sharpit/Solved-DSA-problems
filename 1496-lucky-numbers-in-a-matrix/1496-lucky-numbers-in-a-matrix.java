class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            int minCol = minColInRow(matrix[row]);
            int value = matrix[row][minCol];
            
            if (checkIfMaxInCol(matrix, minCol, value))
                res.add(value);
        }
        return res;
    }

    int minColInRow(int[] A) {
        int minIndex = 0, min = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] < min) {
                min = A[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    boolean checkIfMaxInCol(int[][] matrix, int col, int value) {
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][col] > value) return false;
        }
        return true;
    }
}