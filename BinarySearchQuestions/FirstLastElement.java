public class FirstLastElement {
    public static int[]firstLast(int arr[],int target){
        int first=first(arr,target);
        int last=last(arr,target);
        return new int[]{first,last};
    }
    public static int first(int arr[],int target){
        int start=0,end=arr.length-1,first=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                first=mid;
                end=mid-1;
            }
            else if(arr[mid]>target)
            end=mid-1;
            else
            start=mid+1;
        }
        return first;
    }
    public static int last(int arr[],int target){
        int start=0,end=arr.length-1,last=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                last=mid;
                start=mid+1;
            }
            else if(arr[mid]>target)
            end=mid-1;
            else
            start=mid+1;
        }
        return last;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,3,4,5,6};
        int ans[]=firstLast(arr, 3);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    
}
