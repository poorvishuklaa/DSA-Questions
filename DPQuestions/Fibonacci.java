package DPQuestions;

// import java.util.Arrays;

//Memoization T-O(n) S-O(n)
// public class Fibonacci {
//     public static int f(int n,int dp[]){
//         if(n<=1)
//         return n;
//         if(dp[n]!=-1)
//         return dp[n];

//         return dp[n]=f(n-1,dp)+f(n-2,dp);
//     }
//     public static void main(String[] args) {
//         int n=10;
//         int dp[]=new int[n+1];
//         Arrays.fill(dp,-1);
//         System.out.println(f(n,dp));
        
//     }
    
// }
//Tabulation O(N)
// public class Fibonacci {
//     public static void main(String[] args) {
//         int n=10;
//         int dp[]=new int[n+1];
//         Arrays.fill(dp,-1);
//         dp[0]=0;
//         dp[1]=1;
//         for(int i=2;i<=n;i++){
//             dp[i]=dp[i-1]+dp[i-2];
//         }
//         System.out.println(dp[n]);
//     }  
// }
//Space complexity O(1)
public class Fibonacci {
    public static void main(String[] args) {
        int n=10;
        int first=0;
        int second=1;
        for(int i=2;i<=n;i++){
            int third=first+second;
            first=second;
            second=third;
        }
        System.out.println(second);
    }
    
}
