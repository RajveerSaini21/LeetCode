class Solution {
    public static int lowerBound(int[] arr, int n, int target) {
        int low = 0;
        int high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int upperBound(int[] arr, int n, int target) {
        int low = 0;
        int high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] arr, int target) {
        int n = arr.length;
        int lower = lowerBound(arr, n, target);
        int upper = upperBound(arr, n, target);
        if (lower == n || arr[lower] != target) {
            return new int[]{-1, -1};
        }
        return new int[]{lower, upper};
    }
}