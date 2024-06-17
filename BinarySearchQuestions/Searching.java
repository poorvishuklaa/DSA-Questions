public class Searching{
    public static int search(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            if(arr[mid]==target)
                return mid;
            else if(target>arr[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
         int arr[]={2,4,5,7,11,13,15,23,26,36,79};
         int ans=search(arr, 26);
         System.out.println(ans);
    }
}