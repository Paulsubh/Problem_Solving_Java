package Arrays;

public class ReverseArray {
    public static int[] reverseArray(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            // Swap the elements at start and end positions
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
     return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverseArray(arr);
        for(int e:arr){
            System.out.print(e+" ");
        }
    }
    
}
