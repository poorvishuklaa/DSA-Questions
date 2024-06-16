package StringsQuestions;

public class Anagrams {
    public static boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        int count[]=new int[256];
        for(int i=0;i<str1.length();i++){
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;


    }
    public static void main(String args[]){
        String str1="heart";
        String str2="earth";
        boolean ans=isAnagram(str1,str2);
        System.out.println(ans);
        
    }
    
}
