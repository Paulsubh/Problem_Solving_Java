package Arrays;

public class LargestElementArray {
    public static int checkLargestElement(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr1[]={10,20,30,40,50,60,70};
        int arr2[]={10,2,5,7,8};
        System.out.println("The largest element of the first array is: "+checkLargestElement(arr1));
        System.out.println("The largest element of the second array is: "+checkLargestElement(arr2));
    }
}
