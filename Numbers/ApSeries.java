public class ApSeries {
    public static double APcheck(double a, double d, int n) {
        double first = a, differnce = d;
        int NumOfTerms = n;
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += first;
            first += differnce;

        }
        return sum;
    }

    public static void main(String[] args) {
        double a = 12;
        double d = 10;
        int n = 5;
        System.out.println("The sum of the AP series:" + APcheck(a, d, n));

    }
}
