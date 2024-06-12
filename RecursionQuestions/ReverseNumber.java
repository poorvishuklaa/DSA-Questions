public class ReverseNumber {
    public static int reverse(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;
    }
    static int rev=0;
    public static void recReverse(int n){
        if(n<=0)
        return;
        rev=rev*10+n%10;
        recReverse(n/10); 
    }
    public static void main(String[] args) {
        int num=1234;
        recReverse(num);
        System.out.println(rev);
    }
}
