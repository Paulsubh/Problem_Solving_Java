import java.util.Scanner;

public class PositiveNegative {
     static boolean checkPositiveNegative(int n) {
          if(n>0){
            return true;
          }else{
           return false;
          }
        }
        public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter a number:");
          int n = sc.nextInt();
          if(n==0){
            System.out.println("Number is zero");
          }
          else if (checkPositiveNegative(n)) {
            System.out.println(n + " is a postive buddy!");
          } else {
            System.out.println(n + " is a negative buddy!");
          }
        }
      }