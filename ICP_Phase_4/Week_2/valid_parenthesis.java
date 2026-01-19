package ICP_Phase_4.Week_2;

import java.util.Stack;

public class valid_parenthesis {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
    
    public static boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(!st.isEmpty() && matches(st.peek(),ch)){
                    st.pop();
                    // st.push(ch);
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static boolean matches(char a, char b){
        if(a=='(' && b==')'){
            return true;
        }
        if(a=='{' && b=='}'){
            return true;
        }
        if(a=='[' && b==']'){
            return true;
        }
        return false;

    }
}
