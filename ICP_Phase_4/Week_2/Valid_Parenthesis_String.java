package ICP_Phase_4.Week_2;

import java.util.Stack;

public class Valid_Parenthesis_String {
    public static void main(String[] args) {
        String s="(**(*()**()**((**(*)"; // true
        System.out.println(checkValidString(s));
    }
    public static  boolean checkValidString(String s) {
        Stack<Integer> open= new Stack<>();
        Stack<Integer> star= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') open.push(i);
            else if(s.charAt(i)=='*') star.push(i);
            else{
                if(open.isEmpty() && star.isEmpty()){
                    return false; // Neither star or open brac. Avail. for close brac.
                }
                if(!open.isEmpty()){
                    open.pop();
                }
                else if(!star.isEmpty()){
                    star.pop();
                }
            }
        }
        while(!star.isEmpty() && !open.isEmpty()){
            if(star.peek() < open.peek()){
                return false;
            }
            else{
                open.pop();
                star.pop();
                if(open.isEmpty()) return true;
            }
        }
        return open.isEmpty();
    }
}
