package Arrays;

public class ReverseArray {
    public static void printArray(int arr[],int n){
        System.out.println("The reversed array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void reverseArray(int ans[],int n){
        int rev[] =new int[n];
        for(int i=n-1;i>=0;i--){
            rev[n-i-1]=ans[i];
        }
        printArray(rev,n);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=5;
        reverseArray(arr, n);
    }
    
}
