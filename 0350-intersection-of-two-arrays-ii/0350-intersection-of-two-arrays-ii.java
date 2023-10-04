class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums2.length < nums1.length)
		    return intersect(nums2, nums1);

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> result = new ArrayList<>();
        int leftIndex = 0;
        for(int num: nums1){
            int index = binarySearch(nums2, num, leftIndex);
            if(index != -1){
                result.add(num);
                leftIndex = index + 1;
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    int binarySearch(int[] nums, int target, int l) {
        int h = nums.length - 1, i = -1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (nums[m] == target) {
                i = m;
                h = m - 1;
            } else if (nums[m] > target) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return i;
    }
}