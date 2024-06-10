// package Array40Questions;
import java.util.HashSet;
public class RemoveDuplicates {
    //TIME - O(NlogN+N) SPACE -O(N)
    public static int bruteAppraoch(int arr[]){
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int k=set.size();
        int j=0;
        for(int elem:set){
            arr[j++]=elem;
        }
        return k;
    }
    
    //TIME -O(N) SPACE-O(1)
    public static int optimalApproach(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String args[]){
        int arr[]={1,1,2,2,2,3,3};
        System.out.print("Elements after removing duplicates are :");
        // int size=bruteAppraoch(arr);
        // for(int i=0;i<size;i++){
        //     System.out.print(arr[i]+" ");
        // }  
        int size=optimalApproach(arr);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        } 
    }
}
