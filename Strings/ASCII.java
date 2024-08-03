package Strings;
import java.util.Scanner;

public class ASCII {
    public static void checkAscii(char c){
        int ascii=c;
        System.out.println(ascii);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character to check:");
        char letter=sc.next().charAt(0);
        checkAscii(letter);
    }
    
}
