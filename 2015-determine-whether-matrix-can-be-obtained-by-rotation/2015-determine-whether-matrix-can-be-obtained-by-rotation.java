class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int rotate = 0; rotate < 4; rotate++) {
            if (compareMatrices(mat, target)) {
                return true;
            }
            target = rotate(target);
        }
        return false;
    }

    boolean compareMatrices(int[][] mat1, int[][] mat2) {
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                if (mat1[i][j] != mat2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    int[][] rotate(int[][] mat) {
        int[][] res = new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                res[j][mat.length - 1 - i] = mat[i][j];
            }
        }
        return res;
    }
}