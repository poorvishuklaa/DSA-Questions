
public class FindNumberThatAppearsOnes{
    public static int numberAppearsOnes(int arr[]){
        //using XOR
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];

        }
        return xor;


    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,1,2,3};
        System.out.println(numberAppearsOnes(arr));

    }
}
