package ICP_Phase_4.Week_2;

import java.util.*;

public class infix_to_postfix {
    public static void main(String[] args) {
        String s="a+b*(c^d-e)";
        Stack <Character> st= new Stack<>();
        StringBuilder ans= new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(Character.isDigit(ch) || Character.isLetter(ch)){
                ans.append(ch);
            }
            
            else if(ch=='('){
                st.push(ch);
            }
            else if(ch==')'){
                while(st.peek()!='('){
                    ans.append(st.pop());
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && (precedence(ch)<precedence(st.peek()) ||
                (precedence(ch)==precedence(st.peek()) && ch!='^'))){
                    ans.append(st.pop());
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        System.out.println(ans);
    }
    public static boolean isOpeartor(char ch){
        if(ch=='+' || ch=='-' || ch=='/' || ch=='*' || ch=='^'){
            return true;
        }
        return false;
    }
    public static int precedence(char ch){
        if(ch=='^') return 3;
        if(ch=='*' || ch=='/') return 2;
        if(ch=='+' || ch=='-') return 1;
        return -1;
    }
}
