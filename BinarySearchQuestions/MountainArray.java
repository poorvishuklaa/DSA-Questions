public class MountainArray {
    public static int mountain(int arr[]){
        int start=0,end=arr.length-1,mid;
        while(start<end){
            mid=(start+end)/2;
            if(arr[mid]<arr[mid+1])
            start=mid+1;
            else
            end=mid;
        }
        return start;
    }
   public static void main(String[] args) {
      int array[]={0,1,0};
      System.out.println(mountain(array));

   } 
}
