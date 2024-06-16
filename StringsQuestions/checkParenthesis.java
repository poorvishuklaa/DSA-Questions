package StringsQuestions;

public class checkParenthesis {
    public static boolean checkParenthesiss(String str){
        boolean flag=true;
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                count++;
            }
            else{
                count--;
            }

            if(count<0){
                flag=false;
                break;
            }
        }
        if(count!=0){
            flag=false;
        }
        return flag;
    }
    public static void main(String args[]){
        String str="((((()))))";
        String str2="()()))))(";
        System.out.println(checkParenthesiss(str2));
        System.out.println(checkParenthesiss(str));

    }
    
}
