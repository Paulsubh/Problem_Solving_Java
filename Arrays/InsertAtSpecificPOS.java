package Arrays;

public class InsertAtSpecificPOS {
    public static void InsertAtPOS(int arr[],int n,int value,int POS){
        for(int i=n;i>=POS;i--){
            arr[i]=arr[i-1];
        }
        arr[POS-1]=value;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,0};
        int n=6;
        int POS=4;
        int value=10;
        System.out.print("Before insert at Ending: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        InsertAtPOS(arr, n, value,POS);
        System.out.print("\nAfter insert the value at Ending: ");
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
