package Arrays;

public class SmallestElementArray {
    public static int SmallestElementArray(int[] arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr={10,5,4,2,20};
        System.out.println("The minimum element of the array is :"+SmallestElementArray(arr));
    }
    
}
