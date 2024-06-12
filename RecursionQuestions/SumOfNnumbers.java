public class SumOfNnumbers {
    public static void parametrised(int n,int sum){
        if(n<0){
            System.out.println(sum);
            return;
        }
        parametrised(n-1, sum+n);
    }
    public static int functional(int n){
        if(n==0)
        return 0;
        return n+functional(n-1);
    }
    public static void main(String[]args){
        parametrised(5,0);
        int ans=functional(5);
        System.out.println(ans);
    }
    
}
