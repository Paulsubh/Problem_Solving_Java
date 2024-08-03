public class LeapYear {
    public static boolean checkLeapYear(int n){
        int Year=n;
        if((Year%400==0)||
            (Year%100!=0)&&
            (Year%4==0)){
                return true;
            }else{
                return false;
            }
    }

    public static void main(String[] args) {
        int yr=1993;
        if(checkLeapYear(yr)){
            System.out.println(yr+":is a Leap Year");
        }else{
            System.out.println(yr+":is not a Leap Year");
        }
    }
    
}