class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        List<Integer> v = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                v.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j])
                i++;
            else
                j++;
        }
        int[] ans = new int[v.size()];
        int k = 0;
        for (int val : v)
            ans[k++] = val;
        return ans;
    }
}