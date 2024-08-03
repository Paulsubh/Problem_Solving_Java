import java.util.Scanner;
public class LCM {
    public static int checkGCD(int n1, int n2){
        int gcd=1;
        for(int i=1; i<=Math.min(n1, n2);i++){
            if(n1 % i==0 && n2 % i==0){
                gcd=i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        int lcm=(a*b)/checkGCD(a, b); // Product of two numbers = GCD*LCM
        System.out.println("The lcm of numbers are:"+lcm);
        
    }
    
}
