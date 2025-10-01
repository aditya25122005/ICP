package Home_Assignment_5;

public class Lemonade_change {
    public static void main(String[] args) {
        int [] bills= {5,5,5,10,20};
        System.out.println(lemonadeChange(bills));
    }   
    public static boolean lemonadeChange(int[] bills) {
        int ten=0;
        int five=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5) five++;
            else if(bills[i]==10){
                if(five==0) return false;
                else {
                    five--;
                    ten++;
                }
            }else{
                if(five>0 && ten>0){
                    five--;
                    ten--;
                }
                else if(five>=3){
                    five-=3;
                }
                else{
                    return false;
                }

                
            }
        }
        return true;
    }
}
