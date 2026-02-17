import java.util.*;

class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        List<Integer> lis = new ArrayList<>();

        for (int num : nums) {
            int left = 0, right = lis.size();
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (lis.get(mid) < num) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            if (left == lis.size()) {
                lis.add(num);
            } else {
                lis.set(left, num);
            }
        }

        return lis.size();
    }
}
