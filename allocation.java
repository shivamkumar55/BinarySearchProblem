package BinarySearchProblem;

public class allocation {
    static boolean isValidAns(int arr[], int k, int maxPages){
        int stCount = 1;
        int pages = 0;
        for (int i = 0; i < arr.length; i++) {
            if (pages+arr[i]<=maxPages){
                pages += arr[i];
            }else {
                stCount++;
                if (stCount>k || maxPages<arr[i]){
                    return false;
                }else {
                    pages = 0;
                    pages += arr[i];
                }
            }
        }
        return true;
    }
    public static int findPages(int []arr, int k){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int s = 0;
        int e = sum;
        int ans = -1;
        while (s<=e){
            int mid = s+(e-s)/2;
            if (isValidAns(arr, k, mid)){
                ans = mid;
                e = mid-1;
            }else {
                s = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr [] = {12,34,67,90};
        int k = 2;
        int ans = findPages(arr,k);
        System.out.println(ans);
    }
}
