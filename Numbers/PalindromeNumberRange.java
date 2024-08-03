                            
public class PalindromeNumberRange {
    static boolean isPalindrome(int n) {
        int revNum = 0;
        int dup = n;
        while (n > 0) {
            int ld = n % 10;
            revNum = (revNum * 10) + ld;
            n = n / 10;
        }
        if (dup == revNum) {
            return true;
        } else {
            return false;
        }
    }

    //Checking for a Patricular Number
        /*public static void main(String[] args) {
        int number=4554;
            if(isPalindrome(number)){
                System.out.println(number+"is a palindrome");
            }else{
                System.out.println(number+"is not palindrome");
            }*/
    //Checking for a given range
    public static void main(String[] args) {
        int min=100, max=150;
        for(int i=min; i<=max; i++){
            if(isPalindrome(i)){
                System.out.println(i+"is a palindrome");
            }else{
                System.out.println(i+"is not palindrome");
            }

        }
        }
    }