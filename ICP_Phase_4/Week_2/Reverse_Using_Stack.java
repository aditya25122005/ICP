package ICP_Phase_4.Week_2;

import java.util.Stack;

public class Reverse_Using_Stack {
    public static void main(String[] args) {
        System.out.println(reverse("GeeksforGeeks"));
    }
    public static String reverse(String s) {
        // code here
        Stack<Character> st= new Stack<>();
        for(char ch:s.toCharArray()){
            st.push(ch);
        }
        StringBuilder sb= new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
}
