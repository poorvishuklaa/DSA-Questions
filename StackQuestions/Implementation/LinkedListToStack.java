package StackQuestions.Implementation;

public class LinkedListToStack {
    //create a node class
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //create a stack class to implement linkedlist functions
    public static class Stack{
        static Node head=null;
          //check is Empty
          public static boolean isEmpty(){
               return head==null;
          }
          //push
          public static void push(int data){
            //create a new node
            Node newNode=new Node(data);
            //check
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
          }
          //pop
          public static int pop(){
            int top=head.data;
            if(isEmpty())
            return -1;
            head=head.next;
            return top;
          }
          //peek
          public static int peek(){
            if(isEmpty())
            return -1;
            return head.data;
          }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
           System.out.println(s.peek());
           s.pop();
        }
    }
  
}
