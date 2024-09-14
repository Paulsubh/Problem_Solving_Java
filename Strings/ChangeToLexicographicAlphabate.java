package Strings;

public class ChangeToLexicographicAlphabate {
    public static String checkLexicoGraphic(String str){
        StringBuilder ans = new StringBuilder();
        str = str.toUpperCase();
        char[] ch = str.toCharArray();
        
        for (int i = 0; i < ch.length; i++) {
            int ascii = ch[i];
            if (ascii == 90) {  // If character is 'Z'
                ans.append((char) 65);  // Append 'A'
            } else if (ascii >= 65 && ascii < 90) {  // If character is between 'A' and 'Y'
                ans.append((char) (ascii + 1));  // Append next character
            }else {
                ans.append(ch[i]);
                }// Append non-alphabet ch
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String str = "Zebra Ankita";
        System.out.println(checkLexicoGraphic(str));  // Output: "BOLJUB"
    }
    
}
