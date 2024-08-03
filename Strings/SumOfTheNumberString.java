package Strings;

public class SumOfTheNumberString {
    public static int SumOfTheNumber_String(String str){
        String temp_sum="0";
        int sum=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                temp_sum+=ch;
            }else{
                sum+=Integer.parseInt(temp_sum);
                temp_sum="0";
            }

        }
        return sum+Integer.parseInt(temp_sum);

    }
    public static void main(String[] args) {
        String s="12hfxc20jk12";
        System.out.println("The sum of the number in the string:"+SumOfTheNumber_String(s));
    }
    
}
