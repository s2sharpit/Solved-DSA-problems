class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;
        int index = 0;

        // if (ruleKey.equals("type")) index = 0;
        if (ruleKey.equals("color")) index = 1;
        if (ruleKey.equals("name")) index = 2;

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(index).equals(ruleValue))
                res++;
        }

        return res;
    }
}