import java.util.ArrayList;

public class DiceRolls {
    public static void dice(String str,int target){
        if(target==0){
        System.out.print(str+" ");
        return;
        }
        for(int i=1;i<=6 && i<=target ;i++){
            dice(str+i,target-i);
        }
    }
    public static ArrayList<String> rolls(String str,int target){
        if(target==0){
            ArrayList<String>list=new ArrayList<>();
            list.add(str);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        for(int i=1;i<=6 && i<=target ;i++){
            ans.addAll(rolls(str+i,target-i));
        }
        return ans;

    }
    public static void main(String[] args) {
        dice("",4);
        System.out.println();
        System.out.println(rolls("",4));
    }
    
}
