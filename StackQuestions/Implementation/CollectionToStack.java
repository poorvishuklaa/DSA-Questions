package StackQuestions.Implementation;
import java.util.Stack;
public class CollectionToStack {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        //first in
        st.push(1);
        st.push(2);
        st.push(3);
        //last out
        while(!st.isEmpty()){
        //   System.out.println(st.pop()); //alone can print as well as pop
          System.out.println(st.peek());//if this alone will go on infinite printing
          st.pop(); //this is must
        }
    }
}
