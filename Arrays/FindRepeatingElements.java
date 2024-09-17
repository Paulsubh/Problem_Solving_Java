package Arrays;
import java.util.Arrays;
public class FindRepeatingElements {
    public static void FindRepeatingElementInArray(int arr[],int n){
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.print( arr[i] +" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,5,4,7,6,4};
        int n=10;
        FindRepeatingElementInArray(arr, n);
    }
    
}
