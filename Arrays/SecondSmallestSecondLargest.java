package Arrays;
import java.util.Arrays;
public class SecondSmallestSecondLargest {
    public static int[] checkSecondSmallestSecondLargest(int arr[]){
        if(arr.length<2){
            throw new IllegalArgumentException("Array must have at least two elements");
        }
        Arrays.sort(arr);
        return new int[]{arr[1],arr[arr.length-2]};
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,5,4};
        int[] result=checkSecondSmallestSecondLargest(arr);
        System.out.println("The second smallest element is :" +result[0]);
        System.out.println("The second largest element is :" +result[1]);
    }
}
