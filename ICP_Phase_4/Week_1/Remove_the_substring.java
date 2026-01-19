package ICP_Phase_4.Week_1;
import java.util.*;
public class Remove_the_substring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        String t= sc.next();
        int n=s.length();
        int m=t.length();
        int [] pre= new int[m];
        int [] suf= new int[m];
        int j=0;
        for(int i=0;i<n && j<m;i++){
            if(s.charAt(i)==t.charAt(j)){
                pre[j++]=i;
            }
        }
        j=m-1;
        for(int i=n-1;i>=0 && j>=0 ; i--){
            if(s.charAt(i)==t.charAt(j)){
                suf[j--]=i;
            }
        }

        int ans= Math.max(suf[0],n-pre[m-1]-1);

        for(int i=1;i<m;i++){
            ans=Math.max(ans,suf[i]-pre[i-1]-1);
        }
        System.out.println(ans);

    }
}
