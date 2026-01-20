package ICP_Phase_4.Week_2;

import java.util.Stack;

public class Daily_temperatures {
    public static void main(String[] args) {
        int [] arr={73,74,75,71,69,72,76,73};
        int [] output = dailyTemperatures(arr);

        for(int val:output ) System.out.print(val+" ");
    }
    public static int[] dailyTemperatures(int[] arr) {
        Stack<Integer> st= new Stack<>();
        int n = arr.length;
        int [] ans= new int[n];

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = 0;
            }
            else{
                ans[i] = st.peek()-i;
            }

            st.push(i);
        }
        return ans;
    }
}
