// class Solution {
//     public int uniquePaths(int m, int n) {
//         int N = n+m-2 ; 
//         int r = m-1 ; 
//         double res = 1 ; 
//         for(int i = 1 ; i <= r ; i++){ 
//             res = res * (N-r+i) / i ; 
//         }
//         return (int)res ;
//     }
// }

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n] ;
        for(int j = 0 ; j < n ; j++) dp[0][j] = 1 ; 
        for(int j = 0 ; j < m ; j++) dp[j][0] = 1 ; 
        for(int i = 1 ; i < m ; i++){
            for(int j = 1 ; j < n ; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1] ; 
            }
        } 
        return dp[m-1][n-1] ; 
    }
}