package Arrays;
import java.util.Arrays;
//Remove Duplicates From an Unsorted Array
public class RemoveDuplicateElements {
    public static int RemoveDup(int arr[]){
        Arrays.sort(arr);
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[]={1,1,3,3,3,2,2,4};
        int  k=RemoveDup(arr);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }


    
}
