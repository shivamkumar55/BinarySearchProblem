package BinarySearchProblem;

public class sqrt {
    public static int mySqrt(int x) {
        int ans = 0;
        int s = 0;
        int l = x;
        while(s<=l){
            int mid = s+(l-s)/2;
            long square = (long) mid*mid;
            if(square == x){
                return mid;
            }
            if(square<x){
                ans = mid;
                s = mid+1;
            }
            else{
                l = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 64;
        System.out.println(mySqrt(x));
    }
}
