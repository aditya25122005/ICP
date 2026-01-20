package ICP_Phase_4.Week_2;

import java.util.*;

public class stock_span_problem {
    public static void main(String[] args) {
        int [] arr = {100, 80, 90, 120};
        int [] res= Solve(arr);
        for(int num:res){
            System.out.print(num+" ");
        }

    }
    public static int[] Solve(int [] arr){

        int n= arr.length;
        int [] ans= new int[n];
        Arrays.fill(ans,1);
        Stack<Integer> st= new Stack<>();

        for(int i=0;i<arr.length;i++){
            int curr=0;
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                curr+= ans[st.pop()];
            }
            ans[i] += curr;
            st.push(i);
        }
        return ans;



    }
}
