class Solution {
    public int search(int[] arr, int target) {
        int low = 0 ; 
        int high = arr.length - 1 ; 

        while(low <= high){
            int mid = low + (high - low)/2 ; 

            if(target < arr[mid]){
                high = mid - 1 ; 
            }
            else if(target > arr[mid]){
                low = mid + 1 ; 
            }
            else{
                return mid ; 
            }
        }
        return -1 ; 
    }
}