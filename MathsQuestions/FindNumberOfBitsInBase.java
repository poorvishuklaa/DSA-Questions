// package MathsQuestions;

public class FindNumberOfBitsInBase {
    public static void main(String[] args) {
        int num=1000;
        int base=2;
        int ans=(int)(Math.log(num) / Math.log(base))+1;
        System.out.println(ans);
    }
    
}
