// package MathsQuestions;
public class OddEven {
    public static void main(String[] args) {
        int num=16;
        System.out.println(isOdd(num));
    }
    public static boolean isOdd(int num){
        return (num&1)==1;
    }
}
