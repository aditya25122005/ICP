package ICP_Phase_4.Week_2;

import java.util.Stack;

public class Help_Classmates {
    public static void main(String[] args) {
        int arr[] = {3, 8, 5, 2, 25};
        int N=5;
        int [] ans = help_classmate(arr, N);
        for(int num:ans){
            System.out.print(num+" ");
        }
    }
    
        public static int[] help_classmate(int arr[], int n) {
        // Your code goes here
        Stack<Integer> st= new Stack<>();
        int [] ans= new int[n];
        ans[n-1] = -1;
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=arr[st.peek()];
            }
            st.push(i);
        }
        return ans;
        
    }
}
