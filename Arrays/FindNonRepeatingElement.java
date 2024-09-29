package Arrays;
import java.util.Arrays;
public class FindNonRepeatingElement {
    public static void NonRepeatingElement(int arr[]){
        int n=arr.length;
        Arrays.sort(arr);
        if(arr[0]!=arr[1]){
            System.out.print(arr[0]+" ");
        }
        for(int i=1;i<n-1;i++){
            if(arr[i-1]!=arr[i]&& arr[i]!=arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
        if(arr[n-2]!=arr[n-1]){
            System.out.print(arr[n-1]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,-1,1,3,1};
        System.out.println("The non-repeating characters are: ");
        NonRepeatingElement(arr);

    }
}
