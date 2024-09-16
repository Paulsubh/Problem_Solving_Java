package Arrays;

public class AvgOfAllElements{
    public static void checkAvgOfElements(int arr[],int n){
        double sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        double avg= sum/n;
        System.out.println("The average of all elements is :"+avg);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=5;
        checkAvgOfElements(arr, n);
    }
}