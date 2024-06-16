package StringsQuestions;

import java.util.StringTokenizer;

public class SplitMethods {
    public static void main(String args[]){
        String str="poorvi-lives-in-indore";
        String strArray[]=str.split("-");
        for(String ste:strArray){
            System.out.print(ste+" ");
        }
        System.out.println();
        StringTokenizer st=new StringTokenizer(str,"-");
        while(st.hasMoreTokens()){
            String s2=st.nextToken();
            System.out.print(s2+" ");
        }

    }
    
}
