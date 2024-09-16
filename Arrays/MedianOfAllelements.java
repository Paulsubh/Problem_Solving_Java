package Arrays;
import java.util.Arrays;
public class MedianOfAllelements {
    public static void checkMedianOfArrayElem(int arr[],int n){
        Arrays.sort(arr);
        if(n%2==0){
            int med1=(n/2)-1;
            int med2=(n/2);
            double avgMed=((double) arr[med1]+(double)arr[med2])/2;
            System.out.println("The median of the array elements is: "+avgMed);
        }else{
            int med=arr[n/2];
            System.out.println("The median of the array elements is: "+med);
        }
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int n=5;
        int arr2[]={1,2,3,4};
        int m=4;
        checkMedianOfArrayElem(arr1, n);
        checkMedianOfArrayElem(arr2, m);
    }
}
