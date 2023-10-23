class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int l = 1, r = 1000000000;

        while (l <= r) {
            int m = l + (r - l) / 2;
            long total = 0;
            for (int p: piles)
                total += (p + m - 1) / m;
            if (total > h)
                l = m + 1;
            else
                r = m - 1;
        }
        return l;
    }
}