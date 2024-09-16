package Arrays;

public class InsertAtEnding {
    public static void InsertEndOfArray(int arr[],int n,int value){
        arr[n]=value;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,0};
        int n=6;
        int value=10;
        System.out.print("Before insert at Ending: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        InsertEndOfArray(arr, n, value);
        System.out.print("\nAfter insert the value at Ending: ");
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
