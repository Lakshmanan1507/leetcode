class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(nums, target, true);   // first index
        ans[1] = search(nums, target, false);  // last index

        return ans;
    }

    static int search(int[] arr, int target, boolean findFirst) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                ans = mid;
                if (findFirst) {
                    end = mid - 1;   // move left
                } else {
                    start = mid + 1; // move right
                }
            }
        }
        return ans;
    }
}
