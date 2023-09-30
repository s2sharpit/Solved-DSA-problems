class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (k > arr[m] - m -1) {
                l = m +1;
            } else {
                r = m -1;
            }
        }
        return l + k;
    }
}