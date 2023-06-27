package DSA.DP.oneDDp;

public class ClimbingStairs {

//    Time Complexity: O(2^n)
//    Space Complexity: O(n)

    public static int solveRec(int n){
        if(n == 0 || n == 1) return 1;

        return solveRec(n - 1) + solveRec(n - 2);
    }

    //    Time Complexity: O(n)
    //    Space Complexity: O(n)
    public static int solveMemo(int n, int[] dp){
        if(n == 0 || n == 1) return 1;

        if(dp[n] != -1) return dp[n];

        return dp[n] = solveMemo(n-1, dp) + solveMemo(n - 2, dp);
    }

    //    Time Complexity: O(n)
    //    Space Complexity: O(1)
    public static int solveTab(int n){
        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public int climbStairs(int n) {

        //Recursive:
        // return solveRec(n);

        //Memoization:
//         int[] dp = new int[n + 1];
//         Arrays.fill(dp, -1);
//         return solveMemo(n, dp);


        //Tabulation:
        return solveTab(n);
    }
}
