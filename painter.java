package BinarySearchProblem;

public class painter {
    static boolean isValidAns(int arr[], int k, int maxLength){
        int painterCount = 1;
        int paintedLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (paintedLength+arr[i]<=maxLength){
                paintedLength += arr[i];
            }else {
                painterCount++;
                paintedLength = 0;
                if (painterCount>k || arr[i]>maxLength){
                    return false;
                }else {
                    paintedLength += arr[i];
                }
            }
        }
        return true;
    }
    static int minTime(int[] arr, int k){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        int ans = -1;
        int s = 0;
        int e = sum;
        while(s<=e){
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
        int arr[] = {5,10,30,20,15};
        int k = 3;
        int solution = minTime(arr,k);
        System.out.println(solution);
    }
}
