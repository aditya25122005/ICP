package Home_Assignment_8;

import java.util.Stack;

public class Evaluate_RPN {
    public static void main(String[] args) {
        String [] tokens={"2","1","+","3","*"};
        System.out.println(evalRPN(tokens)); 
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> st= new Stack<>();
        for(String s:tokens){
            if(s.equals("+") || s.equals("-") || s.equals("/")|| s.equals("*")){
                int a=st.pop();
                int b=st.pop(); //  ab/  a=b,,  b==a -> b/a
                int res=0;
                if(s.equals("+")){
                    res=a+b;
                }else if(s.equals("-")){
                    res=b-a;
                }else if(s.equals("*")){
                    res=a*b;
                }else{
                    res=b/a;
                }
                st.push(res);
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}
