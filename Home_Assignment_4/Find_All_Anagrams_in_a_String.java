package Home_Assignment_4;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Anagrams_in_a_String {
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        System.out.println(findAnagrams(s, p));
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ll= new ArrayList<>();
        if(s.length()<p.length()) return ll;
        int [] f1=  new int[26]; // p
        int [] f2= new int[26];  //s
        for(char ch:p.toCharArray()){
            f1[ch-'a']++;
        }
        int si=0;
        int ei=0;
        while(ei<s.length()){
            f2[s.charAt(ei)-'a']++;
            if(ei-si+1 == p.length()){
                if(isOk(f1,f2)) ll.add(si);
                f2[s.charAt(si)-'a']--;
                si++;
            }
            ei++;
        }
        return ll;
    }
    public static boolean isOk(int[] f1, int[] f2){
        for(int i=0;i<f1.length;i++){
            if(f1[i]!=f2[i]){
                return false;
            }
        }
        return true;
    }
}
