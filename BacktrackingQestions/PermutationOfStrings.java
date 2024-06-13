package BacktrackingQestions;
public class PermutationOfStrings {
    public static void printPermuations(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.print(ans+ " ");
            return;
        }
        //recursive call
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String rest=str.substring(0, i)+ str.substring(i+1);
            printPermuations(rest, ans+ch);
        }
    }
    public static void main(String[] args) {
        String str="ABC";
        printPermuations(str,"");
    }  
}
