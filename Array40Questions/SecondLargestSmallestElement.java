// package Array40Questions;
public class SecondLargestSmallestElement {
    static int secondLargest(int arr[],int n){
        if(n<2)
        return -1;
        
        int Large=Integer.MIN_VALUE;
        int Second_Largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>Large){
                Second_Largest=Large;
                Large=arr[i];
            }
            else if(arr[i]>Second_Largest && arr[i]!=Large){
                Second_Largest=arr[i];

            }

        }
        return Second_Largest;
    }
    static int secondSmallest(int arr[],int n){
        int smallest=Integer.MAX_VALUE;
        int second_smallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                second_smallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<second_smallest && arr[i]!=smallest){
                second_smallest=arr[i];
            }
        }
        return second_smallest;

    }
    public static void main(String args[]){
        int arr[]={2,78,0,12,34};
        System.out.println(secondLargest(arr,5));
        System.out.println(secondSmallest(arr,5));
        
    }
    
}
