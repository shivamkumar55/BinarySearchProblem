package BinarySearchProblem;

public class peakIndex {
    static int findPeakIndex(int arr[]){
        int s = 0;
        int l = arr.length-1;
        while (s<l){
            int mid = s + (l-s)/2;
            if(arr[mid]<arr[mid+1]){
                s = mid + 1;
            }else {
                l = mid;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int arr[] = {0,2,4,5,6,3,1};
        int x = findPeakIndex(arr);
        System.out.println("peak index = " + x);
    }
}