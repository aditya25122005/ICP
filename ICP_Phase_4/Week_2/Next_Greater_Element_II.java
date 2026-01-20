package ICP_Phase_4.Week_2;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element_II {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,3};
        int [] output = nextGreaterElements(arr);
        for(int val : output) System.out.print(val+" ");
    }
    public static int[] nextGreaterElements(int[] nums) {
        int n= nums.length;
        int [] ans= new int[n];
        Arrays.fill(ans,-1);
        Stack<Integer> st= new Stack<>();

        for(int i=2*n-1; i>=0;i--){
            int idx= i%n;

            while(!st.isEmpty() && st.peek()<= nums[idx]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[idx] = -1; 
            }
            else{
                ans[idx] = st.peek();
            }

            st.push(nums[idx]);
        }
        return ans;

    }
}
