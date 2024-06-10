public class PascalsTriangle2 {
    //variation 2 Print the nth row of pascals triangle
    public static long nCr(int n,int r){
        long result=1;
        for(int i=0;i<r;i++){
            result=result*(n-i);
            result=result/(i+1);
        }
        return result;
    }

    public static void pascal(int n){
        System.out.println("Printing the entire row of :"+n);
        for(int i=1;i<=n;i++){
            System.out.print(nCr(n-1,i-1)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int n=5;
        pascal(n);
    } 
}
