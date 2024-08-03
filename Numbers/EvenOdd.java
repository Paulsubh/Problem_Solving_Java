public class EvenOdd {
  public static int remainder(int n) {
    return (n % 2);
  }
  public static void main(String[] args) {
    int n = 5;
    if (remainder(n) == 0) {
      System.out.println(n + " is even number");
    } else {
      System.out.println(n + " is odd number");
    }
  }
}