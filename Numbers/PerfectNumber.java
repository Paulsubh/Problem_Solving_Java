public class PerfectNumber {
  public static boolean checkPerfect(int n){
        int sum = 0;
        int number=n;

     for (int i = 1; i < number; i++)
       {
     	if (n % i == 0)
 	        sum = sum + i;
       }
       if(sum==number){
        return true;
       }else{
        return false;
       }
    }
   public static void main (String[]args){
    int number=6;
    if(checkPerfect(number)){
        System.out.println(number+":is a perfect buddy");
    }else{
        System.out.println(number+":is not a perfect buddy");
    }

   }
 }