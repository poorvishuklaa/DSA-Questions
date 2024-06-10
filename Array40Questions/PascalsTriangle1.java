public class PascalsTriangle1 {
        public static long nCr(int n,int r){
            long result=1;
            for(int i=0;i<r;i++){
                result=result*(n-i);
                result=result/(i+1);
            }
            return result;

        }
        public static int pascal(int r,int c){
            int element=(int)nCr(r-1,c-1);
            return element;
        }
        // variation one-print element at position r,c
        public static void main(String args[]){
        int r=6,c=3;
        int element=pascal(r,c);
        System.out.println("The element at position (r,c) is :"+element);
    }
    
}
