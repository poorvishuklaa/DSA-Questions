package SinglyLL;
class ReverseLL{
    static Node head;
    static Node tail;
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //add code
    public static void add(int data){
        //create a new node
        Node newNode = new Node(data);
        //empty
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //print
    public static void print(){
        Node temp=head;
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    //reverse
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;

    }

    public static void main(String[] args) {
        ReverseLL r=new ReverseLL();
        r.add(3);
        r.add(2);
        r.add(1);
        r.print();
        r.reverse();
        r.print();
    }
}