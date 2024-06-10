// package Array40Questions;

public class RotateByKplace {
    public static int[] leftRotate(int arr[],int k,int n){
        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
        return arr;
    }
    public static int[] rightRotate(int arr[],int k,int n){
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        return arr;
    }
    public static void reverse(int arr[],int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int n=5;
        int k=3;
        // leftRotate(arr,k,n);
        rightRotate(arr, k, n);
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }


    }

    
}
