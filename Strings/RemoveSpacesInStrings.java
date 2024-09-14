package Strings;

public class RemoveSpacesInStrings {
    public static void main(String[] args) {
        String str="Java Is Very Sexy";
        str=str.replaceAll("\\s","");
        System.out.println(str);
    }
    
}
