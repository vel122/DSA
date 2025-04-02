//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.reverse(s));                        
        }
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String reverse(String str)
    {
        char[]arr=str.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            while(left<right && !Character.isLetter(arr[left]))
            {
                left++;
            }
             while(left<right && !Character.isLetter(arr[right]))
            {
                right--;
            }
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}