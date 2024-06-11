package SinglyLL;
public class LinkedList {

    //Node creation
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //Head,Tail And Size Variable
    public static Node head;
    public static Node tail;
    public static int size;
 
    //Operations 
    //1.ADD ---O(1)
    public static void addFirst(int data){
        //step 1 : Create New Node
        Node newNode = new Node(data);
        size++;
        //Check if the list is empty
        if(head==null){
        head=tail=newNode;
        return;
        }

        //step 2 : newNode next=head
        newNode.next=head;

        //step 3 : head=newNode
        head=newNode;
    }
    public static void addLast(int data){
        //step 1 : create a new node
        Node newNode=new Node(data);
        size++;
        //check if list is empty
        if(head==null){
        head=tail=newNode;
        return;
        }
        //step 2 :newNode next=tail
        tail.next=newNode;

        //step 3 :tail=newNode
        tail=newNode;

    }

    //2.PRINT --- O(n)
    public static void print(){
        Node temp=head;
        if(head==null){
        System.out.println("Linked List is Empty");
        return;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //3. ADD IN MIDDLE --O(n)
    public static void addInMiddle(int data,int index){
        if(index==0){
            addFirst(data);
            return;
        }
       //step1 : Create a node
       Node newNode=new Node(data);
       size++;
       Node temp=head;
       int i=0;
       //step2 :loop until you find index (find value one less than index )
       while(i<index-1){
         temp=temp.next;
         i++;
       }
       //i=index-1 temp will point to prev node(To insert new node at any place we need index of prev node)
       newNode.next=temp.next;
       temp.next=newNode;
    }

    //4. REMOVE--0(1)
    public static int removeFirst(){
        if(size==0){
            System.out.println("Linkedlist is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int value=head.data;
        head=head.next;
        size--;
        return value;
    }
    public static int removeLast(){
        if(size==0){
            System.out.println("LinkedList is empty");
        }
        else if(size==1){
            int value=head.data;
            head=tail=null;
            return value;
        }
        Node prev=head;
        int val=prev.next.data;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        prev.next=null;
        tail=prev;
        return val;

    }

    //5. SEARCH 
    public static int iterativeSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key)
            return i;

            temp=temp.next;
            i++;
        }
        return -1;
    }
    public static int helper(Node head,int key){
        if(head==null)
        return -1;
        if(head.data==key)
        return 0;

        int index=helper(head.next,key);
        if(index==-1)
        return -1;

        return index+1;
    }
    public static int recursiveSearch(int key){
        return helper(head,key);
    }
    //Driver code
    public static void main(String[] args) {
        LinkedList LL=new LinkedList();
        LL.print();

        LL.addFirst(3);
        LL.addFirst(2);
        LL.addFirst(1);
    
        LL.addLast(4);
        LL.addLast(5);

        LL.print();

        LL.addInMiddle(0,0);
        LL.print();

        LL.removeFirst();
        LL.print();

        LL.removeLast();
        LL.print();

        //6. SIZE ---0(1)
        System.out.println(LL.size);
        
        //SEARCH
        System.out.println(iterativeSearch(3));
        System.out.println(recursiveSearch(3));
    } 
}
