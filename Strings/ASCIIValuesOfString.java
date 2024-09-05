package Strings;

import java.util.Scanner;

public class ASCIIValuesOfString {
    public static void checkASCII(String str) {
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int ascii = c; // Convert char to ASCII value
            System.out.println("The ASCII value of '" + c + "' is: " + ascii);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");

        String str = sc.nextLine(); 
        checkASCII(str);

        sc.close(); 
    }
}
