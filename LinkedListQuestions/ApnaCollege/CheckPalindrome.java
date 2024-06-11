// package ApnaCollege;

public class CheckPalindrome {
    //Node class
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    //Add Last code
    public static void addLast(int data){
        //create a new Node
        Node newNode=new Node(data);
        //base case
        if(head==null){
            head=tail=newNode;
            return;
        }
        //tail next=newNode
        tail.next=newNode;
        //tail=newNode
        tail=newNode;
    }
    //print 
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    //find mid
    public static Node getMid(Node head){
         Node slow=head;
         Node fast=head;
         while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
         }
         return slow;
    }
    //palindrome
    public static boolean checkPalindrome(){
        //base condition
        if(head==null || head.next==null){
            return true;//palindrome
        }
        //STEP 1 :find mid
        Node mid=getMid(head);
        //STEP 2 :reverse second half
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        //STEP3 :check lefthalf and righthalf
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        CheckPalindrome ll=new CheckPalindrome();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        

        ll.print();
        System.out.println(ll.checkPalindrome());
    }
    
}
