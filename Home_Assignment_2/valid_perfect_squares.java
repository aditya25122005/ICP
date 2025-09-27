package Home_Assignment_2;

public class valid_perfect_squares {
    public static void main(String[] args) {
        int num=16;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        if(num==1)return true;
        long lo=1;
        long hi=num/2;
        while(lo<=hi){
            long mid=lo+(hi-lo)/2;
            if(mid*mid==num){
                return true;
            }else if(mid*mid<num){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return false;
    }
}
