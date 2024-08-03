package Strings;
import java.util.Scanner;
public class ReverseString {
    public static String RevString(String str){
        char ch[]=str.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your String:");
        String s=sc.nextLine();
        System.out.println("The reverser string is:\n"+RevString(s));
    }
    
}