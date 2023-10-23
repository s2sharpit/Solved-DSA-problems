class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int l = 1, r = piles[piles.length - 1];

        while (l <= r) {
            int m = l + (r - l) / 2;
            long sum = getSum(piles, m);
            if (sum > h) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    long getSum(int[] piles, int m) {
        long sum = 0;
        for (int pile: piles) {
            sum += pile / m + (pile % m == 0 ? 0 : 1);
        }
        return sum;
    }
}