package ICP_Phase_4.Week_2;
import java.util.*;
public class postfix_to_infix {
    public static void main(String[] args) {
        String s="AB-DE+F*/";

        Stack<String> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                st.push(String.valueOf(ch));
            }
            else{
                String a= st.pop();
                String b= st.pop();
                String res="("+b+ch+a+")";
                st.push(res);
            }
        }
        System.out.println(st.pop());
    }
}
