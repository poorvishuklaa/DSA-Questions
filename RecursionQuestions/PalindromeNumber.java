public class PalindromeNumber {
    public static int reverse(int n,int rev){
        if(n<10)
        return rev*10+n;
        else{
            rev=rev*10+n%10;
        }
        return reverse(n/10,rev);

    }
    public static void main(String[] args) {
        int n=123211;
        int rev=reverse(n,0);
        if(n==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
    
}
