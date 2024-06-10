// package Array40Questions;
public class MissingNumber {
    public static int optimalSolution1(int arr[]){
        int n=arr.length;
        int sum1=(n*(n+1))/2;
        int sum2=0;
        for(int i=0;i<n-1;i++){
            sum2+=arr[i];
        }
        return sum1-sum2;
    }
    public static int optimalSolution2(int arr[]){
        int n=arr.length;
        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < n - 1; i++) {
            xor2 = xor2 ^ arr[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
        }
        xor1 = xor1 ^ n; //XOR up to [1...N]

        return (xor1 ^ xor2);
        
    }
    public static void main(String args[]){
     int[]arr={1,2,3,5};
     System.out.println(optimalSolution1(arr));
     System.out.println(optimalSolution2(arr));
    }
    
}
