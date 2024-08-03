package Strings;

public class RemoveBracketsString {
    /*public static String RemBraStri(String str){
        StringBuffer ans=new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='('&& str.charAt(i)!=')' && str.charAt(i)!='{'
            && str.charAt(i)!='}'&& str.charAt(i)!='['&& str.charAt(i)!=']'){
                ans.append(str.charAt(i));

            }
        }
        return ans.toString();
        
    }
    public static void main(String[] args) {
        String s="(a+b)+[c+d]-{e-f}";
        System.out.println("The result String is:\n"+RemBraStri(s));
    }*/

    public static String RemBraStri(String str){
        str=str.replaceAll("[(){}\\[\\]]","");
        return str;

}
public static void main(String[] args) {
    String s="(a+b)+[c+d]-{e-f}";
    System.out.println("The result String is:\n"+RemBraStri(s));
    }
}




