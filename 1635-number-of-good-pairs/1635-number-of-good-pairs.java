class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res = 0, count[] = new int[101];
        for (int i : nums) {
            res += count[i]++;
        }
        return res;
    }
}