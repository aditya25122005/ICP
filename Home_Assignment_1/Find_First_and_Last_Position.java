package Home_Assignment_1;
import java.util.Arrays;
public class Find_First_and_Last_Position{
    public static void main(String[] args) {
        int [] nums={5,7,7,8,8,10};
        int target=8;
        // int [] ans= searchRange(nums, target);
        // for(int num:ans) System.out.println(num);

        int[] ans= new int[2];
        ans[0]=firstOccurence(nums, target);
        ans[1]=lastOccurence(nums, target);
        for(int num:ans) System.out.println(num);


    }
    // O(n)
    public static int[] searchRange(int[] nums, int target) {
        int[] ans= new int[2];
        Arrays.fill(ans,-1);
        int i=0;
        for(int j=i;j<nums.length;j++){
            if(nums[j]==target){
                ans[0]=j;
                break;
            }
        }
        int l=nums.length-1;
        for(int j=l;j>=0;j--){
            if(nums[j]==target){
                ans[1]=j;
                break;
            }
        }
        return ans;
    }
    //O(log N)

    public static int firstOccurence(int [] nums,int target){
        int idx=-1;
        int lo=0;
        int hi=nums.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                idx=mid;
                hi=mid-1;
            }else if(nums[mid]>target){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return idx;

    }
    public static int lastOccurence(int [] nums, int target){
        int idx=-1;
        int lo=0;
        int hi=nums.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                idx=mid;
                lo=mid+1;
            }else if(nums[mid]<target){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return idx;

    }
}