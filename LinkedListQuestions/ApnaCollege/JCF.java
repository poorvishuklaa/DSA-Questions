// package ApnaCollege;
import java.util.LinkedList;
public class JCF {
    public static void main(String[] args) {
        //create
        LinkedList<Integer> LL =new LinkedList<>();
        //add
        LL.addFirst(6);
        LL.addLast(3);
        LL.addLast(7);
        System.out.println(LL);

        //Remove
        LL.removeFirst();
        LL.remove(1);
        LL.removeLast();
        System.out.println(LL);
    }
    
}
