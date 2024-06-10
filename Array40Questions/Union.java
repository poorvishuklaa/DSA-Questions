// package Array40Questions;
import java.util.Arrays;
import java.util.HashSet;
// import java.util.Set;
public class Union {
    public static HashSet<Integer> union(HashSet<Integer> set1,HashSet<Integer>set2){
        set1.addAll(set2);
        // set1.retainAll(set2);
        // set1.removeAll(set2);
        return set1;
    }
    public static void main(String args[]){
        HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,4,3));
        HashSet<Integer> set2 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
        System.out.println(union(set1,set2));
    }
    
}
