import java.util.Scanner;

public class PermutationCombination {
    public static int Factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        System.out.print("Enter the value of r:");
        int r=sc.nextInt();
        int permu=(Factorial(n)/Factorial(n-r));
        int combi=Factorial(n)/(Factorial(r)*Factorial(n-r));
        System.out.println("The permutations are:"+permu);
        System.out.println("The combinations are:"+combi);



    }
}
