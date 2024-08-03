public class GPSeries {
    public static double GPcheck(double a,double r,int n){
        double first=a,commonRatio=r;
        int NumOfTerms=n;
        double sum=0;
        for(int i=1;i<=n;i++){
        sum+=first;
        first=first*commonRatio;

    }
    return sum;
}
public static void main(String args[]){
    double a=12.5;
    double r=10.5;
    int n=5;
        System.out.println("The sum of the GP series:"+ GPcheck(a, r, n));
    }
    
}
