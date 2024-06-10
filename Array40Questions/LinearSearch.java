// package Array40Questions;
public class LinearSearch {
      public static int linearSearch(int arr[],int key){
      for(int i=0;i<arr.length;i++){
        if(arr[i]==key)
        return i;
      }
      return -1;
}
    public static void main(String args[]){
    int arr[]={2,1,4,5,6,8,10,15};
    System.out.print(linearSearch(arr,8));
    }

}

