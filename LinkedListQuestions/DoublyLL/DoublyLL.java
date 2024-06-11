public class DoublyLL {
    //class
    public static class Node{
        Node prev;
        int data;
        Node next;
        Node (int data){
            this.prev=null;
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    //add first
    public static void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        //base condition
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    //add last
    public static void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    //remove first
    public static int removeFirst(){
        if(head==null){
        System.out.println("DLL IS EMPTY");
        return Integer.MIN_VALUE;
        }
        if (size==1) {
            int value=head.data;
            head=tail=null;
            size--;
            return value;
        }
        int value=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return value;
    }
    //remove last
    public static int removeLast(){
        if(head==null){
            System.out.println("DLL IS EMPTY");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            
        }
        int value=head.data;
        return value;
    }
    //print
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    //reverse code
    public static void reverse(){
        //3 variables 4 steps
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        DoublyLL dll=new DoublyLL();
        dll.addLast(4);
        dll.addLast(5);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        dll.removeFirst();
        // dll.removeLast();
        dll.print();
        System.out.println(dll.size);
        dll.reverse();
        dll.print();

    }
}
