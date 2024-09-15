package Arrays;

public class SumofElements {
    public static int checkSumofElements(int arr[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,7};
        int n=4;
        System.out.println("The sum of the elements is : "+checkSumofElements(arr, n));
    }
}
