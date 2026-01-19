package ICP_Phase_4.Week_2;

import java.util.*;

public class Remove_Outermost_Parenthesis {
    public static void main(String[] args) {
        String s="(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
    public static String removeOuterParentheses(String s) {
        StringBuilder sb= new StringBuilder();
        Stack<Character> st= new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch=='('){
                if(!st.isEmpty()){
                    sb.append(ch);
                }
                st.push(ch);
            }
            else if(ch==')'){
                st.pop();
                if(!st.isEmpty()){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}
