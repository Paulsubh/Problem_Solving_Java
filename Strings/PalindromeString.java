package Strings;

public class PalindromeString {
    public static boolean checkPalindromeStr(String str){
        String rev="";
        boolean ans=false;
        for(int i=str.length()-1;i>=0;i--){
        rev=rev + str.charAt(i);//d-->B-->C-->B-->A
        }
        if(str.equals(rev)){
            return ans=true;
        }
        return ans;


    }
    public static void main(String[] args) {
        String s="AbCba";
        s = s.toLowerCase();//abcba
        boolean Answer=checkPalindromeStr(s);
            System.out.println(Answer);
        }
    }