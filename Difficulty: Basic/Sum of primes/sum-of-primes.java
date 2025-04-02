//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(in.readLine());

            Solution ob = new Solution();
            System.out.println(ob.primeSum(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int primeSum(int n) {
        int sum=0;
        while(n>0)
        {
           int digit=n%10;
           if(isPrime(digit))
           {
            sum=sum+digit;
           }
           n/=10;
        } 
        return sum;
    }
    public static boolean isPrime(int num)
    {
        if(num<2)
        {
            return false;
        }
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
            {
               return false;
            }
        }
        return true;
    }
}