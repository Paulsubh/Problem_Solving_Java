package Strings;

import java.util.Arrays;

public class AnagramString {
    public static String SortString(String s){
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
public static boolean checkAnagramString(String str1, String str2 ){
    if(str1.length()!=str2.length()){
        return false;
    }
    str1=SortString(str1);
    str2=SortString(str2);
    for(int i=0;i<str1.length();i++){
        if(str1.charAt(i)!=str2.charAt(i)){
            return false;
        }
    }
        return true;
}
public static void main(String[] args) {
    String str1="CAT";
    String str2="TAC";
    if(checkAnagramString(str1, str2)){
        System.out.println("The strings are in anagram.");
    }else{
        System.out.println("The strings  are not  in anagram.");
    }
  }
}
