package Strings;

/*public class RemoveVowelsOfString {
    public static String removeVowles(String str){
       return str.replaceAll("[aeiou]","");
    }
    public static void main(String[] args) {
        String s="Apple";
        s=s.toLowerCase();
        System.out.println("After removing vowel the string is: \n"+removeVowles(s));
    }
    
}*/

import java.util.Scanner; 

public class RemoveVowelsOfString { 

	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to remove the vowels:");
		String s = sc.nextLine();
		s=s.toLowerCase();
		for (int i = 0; i <s.length(); i++) { 
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
				|| s.charAt(i) == 'i' || s.charAt(i) == 'o'
				|| s.charAt(i) == 'u'){
				}
			else { 
				System.out.print(s.charAt(i)); 
			} 
		} 
	} 
}