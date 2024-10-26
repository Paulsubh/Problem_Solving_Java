package Arrays;
import java.util.*;
public class WaveArray {
    public static void WaveArray(int arr[]){
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;

        }
    }
    public static void main(String[] args) {
        int arr[]={1 ,2, 3,5,4};
        System.out.println("The original array is: ");
        for(int e:arr){
            System.out.print(e+" ");
            }
        WaveArray(arr);
        System.out.println("\nThe Wave array is: ");
        for(int e:arr){
        System.out.print(e+" ");
        }
    }
    
}
