public class FibonacciSeries {
    public static void printFibonacci(int n) {
        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // to compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }

    public static void main(String[] args) {
        int n = 10;
        printFibonacci(n);
    }
}
