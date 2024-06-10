// package Array40Questions;

public class MoveZerosToEnd {
    public static int []move0toEnd(int arr[]){
        int j=-1;
        //point j to first 0
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        //no non-zero element
        if(j==-1){
            return arr;
        }

        //swap
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }
    public static void main(String args[]){
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int []ans=move0toEnd(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    
}
