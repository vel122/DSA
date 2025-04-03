//{ Driver Code Starts
import java.lang.*;
import java.util.*;

class WildcardPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String pat = sc.nextLine();
            String text = sc.nextLine();
            Solution g = new Solution();
            if (g.wildCard(text, pat) == true) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            t--;

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public boolean wildCard(String txt, String pat) {
        int m=txt.length();
        int n=pat.length();
        boolean [][]dp=new boolean[m+1][n+1];
        dp[0][0]=true;
        for(int j=1;j<=n;j++)
        {
            if(pat.charAt(j-1)== '*')
            {
                dp[0][j]=dp[0][j-1];
            }
        }
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(pat.charAt(j-1) == '?' || pat.charAt(j-1)==txt.charAt(i-1))
                {
                    dp[i][j]=dp[i-1][j-1];
                    
                }
                else if(pat.charAt(j-1) == '*')
                {
                    dp[i][j]=dp[i-1][j] || dp[i][j-1];
                }
        }
    }
    return dp[m][n];
}
}
