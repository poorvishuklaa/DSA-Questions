// package StackQuestions.Questions;
import java.util.Stack;
public class ReverseString {
    public static String reverseString(String s){
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            //push in stack
            stack.push(s.charAt(i));
        }
        //push-pop first in form of charcter aaray then return in string format
        StringBuilder result=new StringBuilder("");
        while(!stack.isEmpty()){
           char curr=stack.pop();
           result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s="abc";
        String ans=reverseString(s);
        System.out.println(ans);
    }
}
