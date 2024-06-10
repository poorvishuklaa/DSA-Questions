// package Array40Questions;
public class LongestSubarrayWithGivenSum{
    public static int longestSubArray(int arr[],long givenSum){
        int n=arr.length;
        int len=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int ArraySum=0;
                for(int k=i;k<=j;k++){
                    ArraySum+=arr[k];
                }
                if(givenSum==ArraySum){
                  len=Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }

    public static void main(String args[]){
        int[] a = {2, 3, 5, 1, 9,5};
        long k = 15;
        int len = longestSubArray(a, k);
        System.out.println("The length of the longest subarray is: " + len);

    }


}