package Arrays;

public class InsertAtBegining {
    public static void InsertBegOfArray(int arr[],int n,int value){
        for(int i=n-1;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=value;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,0};
        int n=6;
        int value=10;
        System.out.print("Before insert at Beginning: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        InsertBegOfArray(arr, n, value);
        System.out.print("\nAfter insert the value at Beginning: ");
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
