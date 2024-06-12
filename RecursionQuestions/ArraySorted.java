public class ArraySorted {
    // iterative
    public static boolean sorted(int array[]){
        for(int i=1;i<array.length;i++){
            if(array[i]<array[i-1]){
                return false;
            }
        }
            return true;
    }
    //recursive
    public static boolean sort(int array[],int index){
        if(index==array.length-1)
        return true;
        return array[index]<array[index+1] && sort(array,index+1);
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        System.out.println(sorted(array));
        System.out.println(sort(array,0));
  
    }
    
}
