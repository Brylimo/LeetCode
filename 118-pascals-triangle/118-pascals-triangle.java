
class Solution {
    int[][] dp = new int[51][51];
        
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 1; i <= numRows; i++)
        {
            dp[i][1] = 1;
            dp[i][i] = 1;
        }
        
        for (int i = 1; i <= numRows; i++)
        {
            List<Integer> sub = new ArrayList<Integer>();
            for (int j = 1; j <= i; j++)
            {
                if (dp[i][j] == 0) {
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                }
                sub.add(dp[i][j]);
            }
            result.add(sub);
        }
        return result;   
    }
}