import java.util.Scanner;

public class climbStairs {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }

        int first = 1;
        int second = 2;

        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }

        return second;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of steps: ");
        int n = scanner.nextInt();
        
        climbStairs solution = new climbStairs();
        System.out.println("Number of ways to climb " + n + " steps: " + solution.climbStairs(n));
    }
}
