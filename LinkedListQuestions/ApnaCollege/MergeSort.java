// package ApnaCollege;


public class MergeSort {
    public static class Node{
        Node next;
        int value;
        Node(int data){
            this.value=data;
            this.next=null;
        }

    }
    //STEP 1 :Find mid
    public static Node getMid(Node head){
         Node slow=head;
         Node fast=head.next;
         while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
         }
         return slow;
    }

    // STEP 2: MERGE SORT CODE
    public static Node mergeSort(Node head){
        //base condition
        if(head==null || head.next==null){
            return head;
        }
        //find mid
        Node mid=getMid(head);
        //left half right half
        Node rightHead=mid.next;
        mid.next=null;
        Node left=mergeSort(head);
        Node right=mergeSort(rightHead);
        //merge
        return merge(left,right);
    }
    public static Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        //Compare in left right
        while(head1!=null && head2!=null){
            if(head1.value<=head2.value){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        //Rest elem of left
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        //Rest elem of right
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedLL.next;
    }
    //ADD FIRST CODE
    public static void addFirst(int value){
        //create a new Node
        Node newNode=new Node(value);
        //base case
        if(head==null){
            head=tail=newNode;
            return;
        }
        //connect
        newNode.next=head;
        //head to newNode
        head=newNode;
    }
    //Print
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node head;
    public static Node tail;
    public static void main(String[] args) {
        MergeSort LL=new MergeSort();
        LL.addFirst(0);
        LL.addFirst(2);
        LL.addFirst(45);
        LL.addFirst(4);
        LL.addFirst(13);
        LL.print();

        LL.head=LL.mergeSort(LL.head);
        LL.print();
    }

 
}
