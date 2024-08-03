package Strings;

public class RemoveCharactersInStrings {
    public static String RemoveCharacters(String str,int length){
        StringBuffer ans=new StringBuffer();
        for(int i=0; i< length ;i++){
            int ascii=(int)str.charAt(i);//An)(*^kita
            if(ascii>=65 && ascii<= 90 || ascii>=97 && ascii<=122){
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s="🤡lawde🫵";
        int l=s.length();
        System.out.println(RemoveCharacters(s, l));

        }
        
}