package Strings;

public class ChangeToLexicographicAlphabate {
    public static String ChangeToLexicographic(String str){
        StringBuffer ans = new StringBuffer();
        str=str.toUpperCase();
        for(int i=0;i<str.length();i++){
            int ascii=(char)str.charAt(i);
            if(ascii==90){
                ans.insert(i,(char)65);
            }else if(ascii >= 65 && ascii <90){
                ans.insert(i, (char)(ascii+1));
            }
        }
        return ans.toString();

    }
    public static void main(String[] args) {
        String str="Java";
        System.out.println("The Lexicographic alphabate is: "+ ChangeToLexicographic(str));
    }
    
}
