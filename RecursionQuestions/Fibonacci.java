// Time Complexity: O(2N)  
// Auxiliary Space: O(n)
public class Fibonacci {
    public static int fibonacci(int n) {
        if(n<=1)
        return n;
        return fibonacci(n-1)+fibonacci(n-2);  
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(10)); //numbering starts from 0(0,1,1,2,3,5,8,13,21)
        //series
        // for(int i=0;i<11;i++){
        //    System.out.print(fibonacci(i)+" ");
        // }
        
    }
}


//ITERATIVE APPROACH
// Time Complexity: O(n)  
// Auxiliary Space: O(1)
// class Fibonacci{
//     public static void fibonacci(int n) {
//         int num1=0;int num2=1;
//         for(int i=0;i<n;i++){
//             System.out.print(num1+" ");
//             int num3=num1+num2;
//             num1=num2;
//             num2=num3;
//         }
//     }
//     public static void main(String[] args) {
//         int n=8;
//         fibonacci(n);
//     }

// }


