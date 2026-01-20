package ICP_Phase_4.Week_2;
import java.util.*;
public class sum_of_subarray_minimums {
    public static void main(String[] args) {
        int [] arr={3,1,2,4};
        System.out.println(sumSubarrayMins(arr));
    }
    public static int sumSubarrayMins(int[] arr) {
        int mod=1000000007;
        int n= arr.length;
        int [] nextSmaller= new int[n];
        Stack<Integer> st= new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nextSmaller[i]=-1;
            }
            else{
                nextSmaller[i]=st.peek();
            }
            st.push(i);
        }
        int [] ans= new int[n];

        for(int i=n-1;i>=0;i--){
            if(nextSmaller[i]==-1){
                int times = n-i;
                ans[i] = (times*arr[i])%1000000007;
            }
            else{
                ans[i]+= (ans[nextSmaller[i]] + ((nextSmaller[i]-i)*arr[i])%1000000007)%mod;
            }
        }
        long total=0;
        for(int v:ans){
            total+=v;
        }
        return (int) (total%mod);
    }

}
