package Arrays;
import java.util.Arrays;
public class RearrangeIncreasingDecreasingOrder {
    public static void checkIncreasingDecreasing(int arr[],int n){
        Arrays.sort(arr);
        for(int i=0;i<n/2;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=n-1;i>=n/2;i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int arr[] = {8,7,1,6,5,9,10};
        int n=7;
        checkIncreasingDecreasing(arr, n);
    }
    
}
