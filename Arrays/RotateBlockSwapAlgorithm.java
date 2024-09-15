package Arrays;

public class RotateBlockSwapAlgorithm {
    public static void checkRotateBlockSwapAlgorithm(int arr[],int n,int k){
        System.out.print("\nThe array after roation is : ");
        for(int i=k;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=5;
        int k=2;
        System.out.print("The array Before rotation is: ");
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }
        checkRotateBlockSwapAlgorithm(arr, n, k);
    }
}
