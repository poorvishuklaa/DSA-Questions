// package Array40Questions;

import java.util.Arrays;
public class SmallestElement{
  //Brute force approach TIME- O(nlogn) SPACE- O(n)
  public static int bruteApproach(int arr[]){
    Arrays.sort(arr);
    return arr[0];
  }

  //optimal approach TIME-O(n) SPACE-O(1)
  public static int OptimalApproach(int arr[]){
    int min=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
      if(arr[i]<min){
        min=arr[i];
      }
    }
      return min;
  }
  public static void main(String args[]){
    int arr[]={2,87,1,90,23};
    System.out.println(bruteApproach(arr));
    System.out.println(OptimalApproach(arr));
  }

}

    
