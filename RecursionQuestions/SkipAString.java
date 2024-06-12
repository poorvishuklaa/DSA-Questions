public class SkipAString {
    public static String skip(String str){
        if(str.isEmpty())
        return "";
        if(str.startsWith("coder"))
            return skip(str.substring(5));
        else
        return str.charAt(0)+skip(str.substring(1));
    }
    public static void main(String[] args) {
        String str="Poorvi is great coder";
        System.out.println(skip(str));
      

    }
}
