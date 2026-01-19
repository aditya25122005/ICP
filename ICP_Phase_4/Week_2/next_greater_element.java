package ICP_Phase_4.Week_2;

import java.util.HashMap;
import java.util.Stack;

public class next_greater_element {
    public static void main(String[] args) {
        int [] nums1 = {4,1,2}, nums2 = {1,3,4,2};
        int [] ans= nextGreaterElement(nums1, nums2);
        for(int num:ans) System.out.print(num+" ");
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] ans= new int[nums1.length];
        HashMap<Integer,Integer> map= new HashMap<>(); // for storing next greater
        Stack<Integer> st= new Stack<>();
        int n=nums2.length;
        for(int i=n-1;i>=0;i--){

            while(!st.isEmpty() && nums2[i] >=nums2[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                map.put(nums2[i],-1);
            }
            else{
                map.put(nums2[i],nums2[st.peek()]);
            }
            st.push(i);
        }
        for(int i=0;i<nums1.length;i++){
            int val= nums1[i];
            ans[i] = map.get(val);
        }
        return ans;

    }
}
