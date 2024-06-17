public class CeilFloor {
    public static int ceil(int arr[],int target){
        int start=0;int end=arr.length-1;
        if(target<arr[0]){
            return -1;
        }
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return target;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public static int floor(int arr[],int target){
        int start=0,end=arr.length-1;
        //condition
        if(target>arr[arr.length-1])
        return -1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target)
            return mid;
            else if(target<arr[mid])
            end=mid-1;
            else
            start=mid+1;
        }
        return end;
    }
    
    public static void main(String[] args) {
        int array[]={2,3,5,9,14,16,18};
        System.out.println(ceil(array, 1));
        // System.out.println(floor(array,1));
    }
    
}
