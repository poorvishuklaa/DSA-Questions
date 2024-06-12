public class ReverseArrayInJava {
    //two pointer approach to reverse an array left and right
    static void reverse(int arr[],int left,int right){
        if(left>=right)
        return;
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        reverse(arr,left+1,right-1);
    }

    //One pointer approach
    static void onePointerRev(int arr[],int i){
        int n=arr.length;
        if(i>=n/2)
        return;
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        onePointerRev(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={3,4,6,1,2,3};
        reverse(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        onePointerRev(arr, 0);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

}
