#include<iostream>
#include<vector>
#include<algorithm>
int main(){
    int arr[]={3,2,1};
    std::next_permutation(arr,arr+3);
    std::cout<<arr[0]<<" "<<arr[1]<<" "<<arr[2];
    return 0;
}