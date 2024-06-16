package StringsQuestions;

public class checkPalindrome {
    public static boolean ispalindrome(String str ,int start,int end){
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String args[]){
        String str="madam";
        if(ispalindrome(str,0,str.length()-1)){
            System.out.println("Palindrome string");
        }
        else{
            System.out.println("Not Palindrome string");
        }
    }
    
}
