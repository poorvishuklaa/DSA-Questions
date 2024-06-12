// import java.util.Scanner;
// package RecursionQuestions;

public class Basic {

    //Recursion forward
    public static void functionF(int i,int n){
        if(i>n)
        return;
        System.out.print(i+" ");
        functionF(i+1, n);
    }
    //Recursion Reverse
    public static void functionR(int i,int n){
        if(i<1)
        return;
        System.out.print(i+" ");
        functionR(i-1,n);
    }
    //Backtrack Forward
    public static void backtrackF(int i,int n){
        if(i>n)
        return;
        backtrackF(i+1,n);
        System.out.print(i+" ");
    }
    //Backtrack Reverse
    public static void backtrackR(int i,int n){
        if(i<1)
        return;
        backtrackR(i-1,n);
        System.out.print(i+" ");

    }
    //Driver Code
    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter a number : ");
        // int n=sc.nextInt();
        int n=5;
        functionF(1,n);
        System.out.println();
        functionR(n,n);
        System.out.println();
        backtrackR(n,n);
        System.out.println();
        backtrackF(1,n);

    }
}
