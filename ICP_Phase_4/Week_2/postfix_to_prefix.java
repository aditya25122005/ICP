package ICP_Phase_4.Week_2;
import java.util.*;
public class postfix_to_prefix {
    public static void main(String[] args) {
        String s = "AB-DE+F*/";
        Stack<String> st= new Stack<>();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch) || Character.isLetter(ch)){
                st.push(String.valueOf(ch));
            }
            else{
                String top1= st.pop();
                String top2= st.pop();
                String res= ch+top2+top1;
                st.push(res);
            }
        }
        System.out.println(st.pop());
    }
}
