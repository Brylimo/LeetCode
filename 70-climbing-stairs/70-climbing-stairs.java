class Solution {
    int[] t = new int[46];
    
    public int climbStairs(int n) {
        t[1] = 1;
        t[2] = 2;
        for (int i = 3; i <= n; i++)
        {
            t[i] = t[i-1] + t[i-2];
        }
        return t[n];
    }
}