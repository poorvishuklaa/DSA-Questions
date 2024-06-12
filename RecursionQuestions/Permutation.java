import java.util.ArrayList;

public class Permutation {
    public static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0,i);
            String second=p.substring(i, p.length());
            permutation(first+ch+second, up.substring(1));
        }
    }
    public static ArrayList<String>permutationList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String>ans=new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i, p.length());
            ans.addAll(permutationList(f+ch+s, up.substring(1)));
        }
        return ans;
        
    }
    public static int permutationCount(String p,String up){
        if(up.isEmpty())
            return 1;
        int count=0;
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0, i);
            String s=p.substring(i,p.length());
            count=count+permutationCount(f+ch+s, up.substring(1));
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print("Permutation: ");
        System.out.println(permutationList("", "abc"));
        permutation("","abc");
        System.out.println();
        System.out.print("Count: "+permutationCount("","abc"));
        
    }
    
}


// public static void subSet(String p,String up){
//     if(up.isEmpty()){
//         System.out.print(p+" ");
//         return;
//     }
//     char ch=up.charAt(0);
//     subSet(p, up.substring(1));
//     subSet(p+ch, up.substring(1));

// }
