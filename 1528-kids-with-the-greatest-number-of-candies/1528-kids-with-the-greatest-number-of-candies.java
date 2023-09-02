class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<Boolean>();

        int max = candies[0];

        for (int candy: candies) {
            max = Math.max(candy, max);
        }

        max -= extraCandies;

        for (int candy: candies) {
            ans.add(candy >= max);
        }

        return ans;
    }
}