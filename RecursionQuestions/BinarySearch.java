public class BinarySearch {
    public static int search(int arr[],int target,int s,int e){
        if(s>e)
        return -1;
        int mid=s+(e-s)/2;
        if(arr[mid]==target)
        return mid;
        if(target<arr[mid])
        return search(arr,target,s,mid-1);

        return search(arr,target,mid+1,e);
    }

    public static void main(String[] args) {
        int arr[]={2,89,0,12,367,67,8,19};
        System.out.println(search(arr,67,0,arr.length-1));
    }
    
}
