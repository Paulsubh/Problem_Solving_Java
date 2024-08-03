import java.util.Scanner;
public class GCD {
    public static int checkGCD(int n1, int n2){
        int gcd=1;
        for(int i=1; i<=Math.min(n1, n2);i++){
            if(n1 % i==0 && n2 % i==0){
                gcd=i;
                continue;
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
        System.out.println("The GCD of two numbers are:"+checkGCD(a, b));
        int lcm=(a*b)/checkGCD(a, b);
        System.out.println("The lcm is:"+lcm);
        
    }
    
}
