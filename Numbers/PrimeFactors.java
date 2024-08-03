public class PrimeFactors {
    public static boolean PrimeNumbers(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        int num=60;
        for(int i=1;i<=num;i++){
            if(num%i==0 && PrimeNumbers(i)){
                System.out.println(i+":is a prime factor");
            }
        }

    }
}