package Strings;
import java.util.Scanner;
public class CountVowConsoSpace {
    public static void count(String str,int length){
        int vowel=0,consonant=0,space=0;
        str=str.toLowerCase();
        for(int i=0;i<length;i++){
            char ch= str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel++;
            }else if(ch>='a' && ch<='z'){
                consonant++;
            }else if (ch==' '){
                space++;
            }
        }
        System.out.println("The number of vowels are:"+vowel);
        System.out.println("The number of consonants are:"+consonant);
        System.out.println("The number of spaces are:"+space);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String to check:");
        String s=sc.nextLine();
        int length=s.length();
        count(s,length);
        
    }
    
}
