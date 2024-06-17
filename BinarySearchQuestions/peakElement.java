public class peakElement {
    public static int peak(int nums[]){
        //base case
        int n=nums.length;
        //single element
        if(n==1)
        return 0;
        //check if 0th and 1st index is peak
        if(nums[0]>nums[1])
        return 0;
        if(nums[n-1] > nums[n-2])
        return n-1;

        //2 to n cases
        int start=1; int end=n-2;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
            return mid;
            else if(nums[mid]<nums[mid-1])
            end=mid-1;
            else if(nums[mid]<nums[mid+1])
            start=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums []= {1,2,3,1};
        System.out.println(peak(nums)); //3
    }
}
