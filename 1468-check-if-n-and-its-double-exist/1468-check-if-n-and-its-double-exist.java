class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int target = 2 * arr[i];
            int l = 0, r = arr.length - 1;

            while (l <= r) {
                int m = l + (r - l) / 2;
                if (arr[m] == target && m != i)
                    return true;
                if (arr[m] < target) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }
        return false;
    }
}