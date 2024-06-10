// package Array40Questions;
import java.util.Arrays;
public class LargestElement{
    //Brute force approach -- TIME O(nlogn) --SPACE O(n)
    static int sort(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    //Optimal approach --TIME O(n) --SPACE O(1)
    static int findLargest(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[]={0,2,1,6,3};
        System.out.println(sort(arr));
        System.out.println(findLargest(arr));
    }

}