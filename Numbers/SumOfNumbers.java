public class SumOfNumbers {
    public static int checkSumOfDigitsOfNumbers(int n){
        int sum=0;
        while(n!=0){
            int ld =n%10;
            sum+=ld;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=-456;
        System.out.println("The sum of numbers is:"+checkSumOfDigitsOfNumbers(n));
    }

}
