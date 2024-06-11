package SinglyLL;

public class Implementation {
    //Basic structure of node class 
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static void main(String[] args) {
        // create an object of LinkedList
        Implementation ll=new Implementation();
    
        //assign values to each node
        ll.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node fourth=new Node(4);
        Node fifth=new Node(5);

        //Link these nodes
        ll.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        //Print value of these nodes
        System.out.print("Linked list elements: ");
        while(ll.head!=null){
            System.out.print(ll.head.data+" ");
            ll.head=ll.head.next;
        }
    }
}
