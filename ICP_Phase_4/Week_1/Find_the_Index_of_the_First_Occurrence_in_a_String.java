package ICP_Phase_4.Week_1;

public class Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static void main(String[] args) {
        String s1 = "sadbutsad";
        String s2 = "sad";
        System.out.println(strStr(s1,s2));
    }
    public static int strStr(String s1, String s2) {
        int i=0;
        while(i<=s1.length()-s2.length()){
            if(s1.charAt(i)==s2.charAt(0)){
                int start=i;
                int idx=i;
                boolean isOk=true;
                for(int k=0;k<s2.length();k++){
                    if(s1.charAt(idx)==s2.charAt(k)){
                        idx++;
                    }
                    else{
                        isOk=false;
                        break;
                    }
                }
                if(isOk){
                    return start;
                }
            }
            i++;
        }
        return -1;
    }
}
