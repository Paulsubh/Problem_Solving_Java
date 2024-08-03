                            
import java.lang.Math;

public class ArmstrongNumber {
    public static boolean isArmstrong(int n) {
        int k = String.valueOf(n).length(); //153-->"153"-->len=3
        int sum = 0;
        int number=n;
        
        while(n > 0){
           
            int ld = n % 10;
            
            sum += Math.pow(ld, k);
            
            n = n / 10;
        }

        if(sum==number){
            return true;
        }else{
            return false;}
    }

    public static void main(String[] args) {
        int number = 9474;
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}                 