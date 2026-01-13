package ICP_Phase_4.Week_1;
import java.util.*;
public class Count_Primes {
    public static void main(String[] args) {
        int n=20;
        boolean [] isPrime= new boolean[n];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
//1,2,3,,5
//,7,,, //  prime ->
//11  13  
// 17  19 
        for(int i=2;i*i<n;i++){ // 2,4,6,8,10,12,14,16,18,20
            for(int j=i*i;j<n;j+=i){
                if(isPrime[j]){
                    isPrime[j]=false;
                }
            }
        }
        int count=0;
        for(int i=0;i<isPrime.length;i++){
            if(isPrime[i]){
                count++;
            }
        }
        System.out.println(count);

    }
}
