// Using PnC 
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

// Using DP 
class Solution {
    public int uniquePaths(int m, int n) {
        // int[][] dp = new int[m][n] ;
        // for(int i = 0 ; i < n ; i++) dp[0][i] = 1 ; 
        // for(int i = 0 ; i < m ; i++) dp[i][0] = 1 ; 
        // for(int i = 1 ; i < m ; i++){
        //     for(int j = 1 ; j < n ; j++){
        //         dp[i][j] = dp[i-1][j] + dp[i][j-1] ; 
        //     }
        // } 
        // return dp[m-1][n-1] ; 
        int[] dp = new int[n] ; 
        for(int i = 0 ; i < n ; i++) dp[i] = 1 ; 
        for(int i = 1 ; i < m ; i++){
            for(int j = 1 ; j < n ; j++){
                dp[j] = dp[j] + dp[j-1] ; 
            }
        } 
        return dp[n-1] ; 
    }
}


// typedef vector<int> vi;
// typedef vector<vi> vvi;

// #define forn(i,n) for(int i = 0; i < n; i++)

// class Solution {
// private:
//     int rec(int i, int j, int m, int n) {
//         if (i==0 || j==0) { return 1; }
//         return rec(i-1, j,m,n) + rec(i,j-1,m,n);
//     }

//     int memo_rec(int i, int j, int m, int n, vvi &memo) {
//         if (memo[i][j] != -1) return memo[i][j];
//         return (memo[i][j] = memo_rec(i-1, j,m,n, memo) + memo_rec(i,j-1,m,n, memo));
//     }

//     int memoized(int m, int n) {
//         vvi memo(m, vi(n,-1));
//         forn(i,n) { memo[0][i] = 1; }
//         forn(j,m) { memo[j][0] = 1; }
        
//         return memo_rec(m-1, n-1, m, n, memo);
//     }
//     int tabulation(int m, int n) {
//         vvi dp(m, vi(n,-1));
//         forn(i,n) { dp[0][i] = 1; }
//         forn(j,m) { dp[j][0] = 1; }
//         for(int i = 1; i < m; i++) {
//             for(int j = 1; j < n; j++) {
//                 dp[i][j] = dp[i-1][j] + dp[i][j-1];
//             }
//         }
//         return dp[m-1][n-1];
//     }
//     int space_optimised(int m, int n) {
//         vi prev(n,1);
//         for(int i = 1; i < m; i++) {
//             vi curr(n,1);
//             for(int j = 1; j < n; j++) {
//                 curr[j] = prev[j] + curr[j-1];
//             }
//             prev = curr;
//         }
//         return prev[n-1];
//     }
//     int double_space_optimise(int m, int n) {
//         vi prev(n,1);
//         for(int i = 1; i < m; i++) {
//             for(int j = 1; j < n; j++) {
//                 prev[j] += prev[j-1];
//             }
//         }
//         return prev[n-1];
//     }
// public:
//     int uniquePaths(int m, int n) {
//         return double_space_optimise(m,n);
//     }
// };