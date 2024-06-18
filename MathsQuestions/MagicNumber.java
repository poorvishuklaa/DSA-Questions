// package MathsQuestions;

public class MagicNumber {
    public static int isMagic(int num){
        int ans=0;
        int base=5;
        while(num>0){
            int last=num&1;
            num>>=1;
            ans+=last*base;
            base=base*5;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(isMagic(1));
    }
}
