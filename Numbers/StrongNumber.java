import java.util.Scanner;

public class StrongNumber {
    public static int Factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    
    public static boolean checkstrongNum(int num){
        int sum=0;
        int number=num;
        while(num>0){
            int ld=num%10;
            sum+=Factorial(ld);
            num=num/10;
        }
        if(sum==number){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int N=sc.nextInt();
        if(checkstrongNum(N) && N!=0){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not a Strong Number");
        }
    }

    
}
