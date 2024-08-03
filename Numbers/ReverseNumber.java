import java.util.Scanner;
public class ReverseNumber {
    public static int checkReverse(int n){
        int revNum=0;
        while(n!=0){
            int ld=n%10;
            revNum=(revNum*10)+ld;
            n=n/10;
        }
        return revNum;
   }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number");
    int n=sc.nextInt();
    System.out.println("The reverse Number is:"+checkReverse(n));    
   }
}
