class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1, end = num / 2 + 1;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid < num) {
                start = (int) mid + 1;
            } else if (mid * mid > num) {
                end = (int) mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}