//You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.
public class SmallestLetterGreaterThanTarget {
    public static char nextCharacter(char[]letter,char target){
        int start=0,end=letter.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(letter[mid]>target)
                end=mid-1;
            
            else
                start=mid+1;
        }
        return letter[start%letter.length];
    }
   public static void main(String[] args) {
    char letters[] = {'c','f','j'};
    char target = 'a';
    System.out.println(nextCharacter(letters, target));
   }
    
}
