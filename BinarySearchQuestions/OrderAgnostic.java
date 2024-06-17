public class OrderAgnostic {
    public static int search(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            //common condition
            if(arr[mid]==target){
                return mid;
            }
            boolean isAscn=arr[start]<arr[end];
            //Ascending order
            if(isAscn){
                if(target>arr[mid])
                start=mid+1;
                else
                end=mid-1;
            }
            //Descending order
            else{
                if(target<arr[mid])
                end=mid-1;
                else
                start=mid+1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int array[]={3,3,3,3,5,6,7,8,9,10,12};
        System.out.println(search(array,5));

    }
    
}
