package Home_Assignment_4;

public class Longest_Repeating_Character_Replacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k=1;
        System.out.println(Solve(s,k));

    }
    public static int Solve(String s, int k){
        int ans=0;
        for(char ch='A';ch<='Z';ch++){
            ans=Math.max(ans,check(s,k,ch));
        }
        return ans;
    }
    public static int check(String s, int k, char ch){
        int si=0;
        int ei=0;
        int ans=0;
        int flip=0;
        while(ei<s.length()){
            if(s.charAt(ei)!=ch){
                flip++;
            }
            while(flip>k){
                if(s.charAt(si)!=ch){
                    flip--;
                }
                si++;
            }
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }

}
