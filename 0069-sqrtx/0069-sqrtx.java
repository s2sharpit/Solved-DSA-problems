class Solution {
    public int mySqrt(int x) {
        int start = 1, end = x / 2;
        if (x == 1) return 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < x / mid) {
                start = mid + 1;
            } else if (mid > x / mid) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}