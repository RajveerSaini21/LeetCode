//Brute Force approach
// class Solution {
//     public int maxSubArray(int[] arr) {
//         int n = arr.length;  
//         int maxSum = 0 ; 
//         for(int i = 0 ; i < n; i++){
//             int currSum = 0 ; 
//             for(int j = i ; j < n ; j++){
//                 currSum += arr[j] ; 
//                 maxSum = Math.max(maxSum , currSum) ;
//             }
//         }
//         return maxSum ; 
//     }
// }

// Kadane's algorithm
class Solution {
    public int maxSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE ; 
        int currSum = 0 ; 
        for(int i = 0 ; i < arr.length ;i++){
            currSum += arr[i] ; 
            maxSum = Math.max(maxSum , currSum) ; 
            if(currSum < 0){
                currSum = 0 ; 
            }
        }
        return maxSum ; 
    }
}