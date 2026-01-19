package ICP_Phase_4.Week_2;

import java.util.Stack;

public class Prefix_Evaluation {
    public static void main(String[] args) {
        String arr[] = {"-", "+", "2", "*", "3", "1", "9"};

        Stack<String> st= new Stack<>();
        for(String str: arr){
            if(isOpr(str)){
                st.push(str);
            }
            else{
                st.push(str);
                while(st.size()>=3 &&!isOpr(st.peek()) && !isOpr(st.get(st.size()-2)) && isOpr(st.get(st.size()-3))){
                    int a= Integer.parseInt(st.pop());
                    int b= Integer.parseInt(st.pop());
                    String opr= st.pop();
                    int ans=0;
                    if(opr.equals("+")){
                        ans=(a+b);
                    }
                    else if(opr.equals("-")){
                        ans=(b-a);
                    }
                    else if(opr.equals("/")){
                        ans=Math.floorDiv(b,a);
                    }
                    else if(opr.equals("*")){
                        ans=(a*b);
                    }
                    else if(opr.equals("^")){
                        ans=(int)Math.pow(b,a);
                    }

                    st.push(String.valueOf(ans));
                }
            }
        }
        System.out.println(Integer.parseInt(st.pop()));

    }
    public static boolean isOpr(String s){
         if(s.equals("+") || s.equals("-") || s.equals("*") ||
             s.equals("/") || s.equals("^")){
                return true;
        }
        return false;

    }
}
