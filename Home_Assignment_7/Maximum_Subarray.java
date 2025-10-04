package Home_Assignment_7;

public class Maximum_Subarray {
    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int curr=0;
        for(int num:nums){
            curr+=num;
            ans=Math.max(ans,curr);
            if(curr<0){
                curr=0;
            }
        }
        return ans;

    }
}
