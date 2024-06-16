package StringsQuestions;

public class EvenLengthWordsInString {
    public static void evenLengthWord(String str){
        for(String word:str.split(" ")){
            if(word.length()%2==0){
                System.out.print(word+" ");
            }

        }
    }
    public static void main(String args[]){
        String str="Poorvi got two internship opportunityy";
        evenLengthWord(str);
    }
    
}
