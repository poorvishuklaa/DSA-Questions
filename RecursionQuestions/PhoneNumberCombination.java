import java.util.ArrayList;

public class PhoneNumberCombination {
    //void
    public static void combi(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        int digit=up.charAt(0)-'0'; //convert string to int
        for(int i=(digit-1)*3 ;i<digit*3;i++){
            char ch=(char)('a'+i);
            combi(p+ch,up.substring(1));
        }
    }
    //ArrayList
    public static ArrayList<String>pad(String p,String up){
        if(up.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        ArrayList<String>ans=new ArrayList<>();
        for(int i=(digit-1)*3 ;i<digit*3;i++){
            char ch=(char)('a'+i);
            ans.addAll(pad(p+ch,up.substring(1)));
        }
        return ans;
        
    }
    public static int count(String p,String up){
        if(up.isEmpty()){
           return 1;
        }
        int count=0;
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            count+=((count(p+ch,up.substring(1))));
        }
        return count;
    }
    public static void main(String[] args) {
        combi("", "12");
        System.out.println();
        System.out.println(pad("", "12"));
        System.out.println("Count: "+count("", "12"));
    }
    
}
