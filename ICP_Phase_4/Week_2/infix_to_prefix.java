package ICP_Phase_4.Week_2;
import java.util.*;
public class infix_to_prefix {
    // Step 1-> Reverse the given expression
    // step 2-> flip the brackets
    // step 3-> perform operations like infix to postfix
    // step4-> Reverse the ans expression

    //point to remember -> If precedence is same then iff ch=='^' we have to pop out
    public static void main(String[] args) {
        String s="(A+B)*C-D+F";
        Stack<Character> st= new Stack<>();
        StringBuilder ans= new StringBuilder();
        char [] arr= s.toCharArray();
        reverse(arr);

        for(int i=0;i<arr.length;i++){
            if(arr[i]=='(') arr[i]=')';
            else if(arr[i]==')') arr[i]='(';
        }

        for(int i=0;i<arr.length;i++){
            char ch= arr[i];
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
                                        precedence(ch)==precedence(st.peek()) && ch=='^')){
                    ans.append(st.pop());
                }
                st.push(ch);
            }
            
           
        }
        while(!st.isEmpty()){
                ans.append(st.pop());
            }
            ans.reverse();
        System.out.println(ans);
    }
    public static int precedence(char ch){
        if(ch=='^') return 3;
        if(ch=='*' || ch=='/') return 2;
        if(ch=='+' || ch=='-') return 1;
        return -1;
    }
    public static void reverse(char [] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            char temp= arr[i];
            arr[i]=arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

}
