// package StackQuestions.Implementation;

public class ArrayToStack {
    public static class stack{
        static int top;
        static int arr[]=new int[100];

        public stack(){
            top=-1;
        }

        //push
        public static void push(int data){
            top++;
            arr[top]=data;
        }
        //top
        public static int peek(){
            return arr[top];
        }
        //size
        public static int size(){
            return top+1;
        }
        //pop
        public static int pop(){
            if(top!=-1)
            return arr[top--];
            return -1;
        }
        //is empty
        public static boolean isEmpty(){
            if(top==-1)
            return true;
            else
            return false;
        }
    }
    public static void main(String[] args) {
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
        System.out.print(s.peek()+" ");
        s.pop();
        }
        System.out.println();
        System.out.print("size "+s.size());
    }
}
