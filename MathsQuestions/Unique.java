// package MathsQuestions;
public class Unique {
    public static int uniqueNum(int arr[]){
        int unique=0;
        for(int i:arr){
            unique=unique^i;
        }
        return unique;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,1,2,3,4,5,};
        System.out.println(uniqueNum(arr));
    }
}
