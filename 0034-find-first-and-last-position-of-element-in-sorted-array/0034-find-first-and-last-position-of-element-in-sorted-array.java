class Solution {
    public static int[] findBounds(int[] arr, int n, int target) {
        int low = 0;
        int high = n - 1;
        int lower = n, upper = n;

        // lower bound
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                lower = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        low = 0; 
        high = n - 1;

        //upper bound 
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                upper = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return new int[]{lower, upper};
    }

    public int[] searchRange(int[] arr, int target) {
        int n = arr.length;
        int[] bounds = findBounds(arr, n, target);
        int lower = bounds[0];
        int upper = bounds[1];
        
        if (lower == n || arr[lower] != target) {
            return new int[]{-1, -1};
        }
        return new int[]{lower, upper};
    }
}
