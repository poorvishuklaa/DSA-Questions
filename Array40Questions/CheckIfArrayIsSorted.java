// package Array40Questions;

public class CheckIfArrayIsSorted {
    // Brute force approach TIME--O(n^2) SPACE--O(1)
    public static boolean isSorted(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i])
                    return false;
            }
        }
        return true;
    }

    // Optimal approach TIME--O(n) SPACE--O(1)
    public static boolean sorted(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    //Driver code
    public static void main(String args[]){
        int array[]={1,2,3,4,5};
        System.out.println(isSorted(array, 5));
        System.out.println(sorted(array, 5));
    }

}
