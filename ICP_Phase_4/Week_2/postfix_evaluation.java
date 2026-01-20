package ICP_Phase_4.Week_2;
import java.util.*;
public class postfix_evaluation {
    public static void main(String[] args) {
        String arr[] = {"2", "3","1" , "*" ,"+", "9" ,"-"};

        Stack<String> st = new Stack<>();
        int n = arr.length;
        for(int i=n-1;i>=0;i--){
            String str= arr[i];
            if(isOpr(str)){
                st.push(str);
            }
            else{
                st.push(str);
                while(st.size()>=3 && !isOpr(st.peek()) && !isOpr(st.get(st.size()-2)) && isOpr(st.get(st.size()-3))){
                    int a= Integer.parseInt(st.pop());
                    int b= Integer.parseInt(st.pop());
                    String opr = st.pop();
                    int ans=0;


                    if(opr.equals("+")){
                        ans=a+b;
                    }
                    else if(opr.equals("-")){
                        ans= a-b;
                    }
                    else if(opr.equals("/")){
                        ans=Math.floorDiv(a, b);
                    }
                    else if(opr.equals("*")){
                        ans= a*b;
                    }
                    else if(opr.equals("^")){
                        ans= (int) Math.pow(a,b);
                    }
                    st.push(String.valueOf(ans));
                }
            }
        }
        System.out.println(st.pop());

    }

    public static boolean isOpr(String s){
        if(s.equals("+") || s.equals("-") || s.equals("/") ||
        s.equals("*") || s.equals("^")){
            return true;
        }
        return false;
    }
}
