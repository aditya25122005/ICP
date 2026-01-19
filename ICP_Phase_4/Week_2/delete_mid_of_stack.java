package ICP_Phase_4.Week_2;

import java.util.Stack;

public class delete_mid_of_stack {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        Solve(st, st.size());
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }

    }
    public static void Solve(Stack<Integer> st, int size){
        
        int curr=0;
        delete(st,size,curr);


    }
    public static void delete(Stack<Integer> st, int size,int curr){
        if(curr==size/2){
            st.pop();
            return;
        }
        int val= st.pop();
        delete(st,size,curr+1);

        st.push(val);
    }
}
