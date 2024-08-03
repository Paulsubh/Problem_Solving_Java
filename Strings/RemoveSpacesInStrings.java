package Strings;

public class RemoveSpacesInStrings {
    public static void main(String[] args) {
        String str="Java is very Sexy";
        str=str.replaceAll("\\s","");
        System.out.println(str);
    }
    
}
