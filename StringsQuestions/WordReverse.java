package StringsQuestions;
public class WordReverse {
    public static void wordReverse(String str){
        String word[]=str.split(" ");
        for(int i=word.length-1;i>=0;i--){
            System.out.print(word[i]+" ");
        }
    }
    public static void main(String args[]){
        String str="poorvi is cutie";
        wordReverse(str);

    }
    
}
