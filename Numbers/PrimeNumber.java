public class PrimeNumber{
    static boolean checkPrime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count=count+1;
            }
        }
        if(count==2){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String args[]){
        int a=1, b=20;
        for(int i=a; i<=b;i++){
            if(checkPrime(i))
            System.out.println(i+":is a prime number");
        
        }
    }
}