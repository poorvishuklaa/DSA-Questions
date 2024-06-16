package StringsQuestions;

public class ReverseNumber {
    public static void main(String[] args) {
        int n=123456;
        //concat using + operator i.e converts into string
        String s=""+n;
        //creating stringBuilder object
        StringBuilder sb=new StringBuilder(s);
        //using reverse method
        StringBuilder str=sb.reverse();
        //print
        System.out.println(str);

    }
    
}
