import java.util.*;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1] ; 
        int index = 0 ; 
        Deque<Integer> deque = new LinkedList<>(); 
        int i = 0 , j = 0 ; 
        while(j < nums.length){
            while(!deque.isEmpty() && deque.peekLast() < nums[j]){
                deque.pollLast() ; 
            }
            deque.addLast(nums[j]) ; 
            if(j - i + 1 < k) j++ ; 
            else{
                ans[index++] = deque.peekFirst() ; 
                if(deque.peekFirst() == nums[i]){
                    deque.pollFirst() ; 
                }
                i++ ; 
                j++ ; 
            }
        }
        return ans ; 
    }
}
