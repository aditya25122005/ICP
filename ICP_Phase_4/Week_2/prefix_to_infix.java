package ICP_Phase_4.Week_2;
import java.util.*;
public class prefix_to_infix {
    public static void main(String[] args) {
        String s="*+PQ-MN";
        int n= s.length();
        Stack<String> st= new Stack<>();
        for(int i=n-1;i>=0;i--){
            char ch= s.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                st.push(String.valueOf(ch));
            }
            else{
                String a= st.pop();
                String b= st.pop();
                String res = "("+a+ch+b+")";
                st.push(res);
            }
        }
        System.out.println(st.pop());

    }
}
