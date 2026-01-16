package ICP_Phase_4.Week_1;

public class First_Missing_Positive {
    public static void main(String[] args) {
        int [] arr= {1,2,0,-1};
        System.out.println(Solve(arr));

    }

    public static int Solve(int [] nums){
    int n=nums.length;
        for(int i=0;i<nums.length;i++){
           
            while(nums[i]>0 && nums[i]<=n && nums[nums[i]-1] != nums[i]){
                int x=nums[i];
                int idx=x-1;
                int temp=nums[idx];
                nums[idx]=x;
                nums[i]=temp;
            }
            
        }

        for(int i=0;i<n;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return n+1;
    }
}
