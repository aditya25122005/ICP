package ICP_Phase_4.Week_2;
import java.util.*;
public class prefix_to_postfix {
    public static void main(String[] args) {
        String s="*+PQ-MN";

        Stack<String> st= new Stack<>();
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            char ch= s.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                st.push(String.valueOf(ch));
            }
            else{
                String a= st.pop();
                String b= st.pop();
                st.push(a+b+ch);
            }
        }
        System.out.println(st.pop());
    }
}
