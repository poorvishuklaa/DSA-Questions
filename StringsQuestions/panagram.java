package StringsQuestions;

public class panagram {
    public static void isPanagram(String str){
        str=str.toLowerCase();
        boolean allLetterPresent=true;
        for(char ch='a';ch<='z';ch++){
            if(!str.contains(String.valueOf(ch))){
                allLetterPresent=false;
                break;
            }
        }
        if(allLetterPresent){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }

    }
    public static void main(String args[]){
        String alphabets="abmnocdefghijklPQrstuvwXYZ"; //order and case doesnt matter but all aplhabets must be present
        isPanagram(alphabets);
    }
    
}
