package Arrays;

public class FindAllSymmmetricPairs {
    public static void SymmetricPairs(int arr[][],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){  //(1,2),(2,1),(3,4),(4,5),(5,4)
                if(arr[j][0]==arr[i][1] && arr[j][1]==arr[i][0]){
                    System.out.print("("+arr[i][1]+","+arr[i][0]+")");
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2},{2,1},{3,4},{4,5},{5,4}};
        int n=5;
        System.out.print("The Symmetric Pais are: ");
        SymmetricPairs(arr, n);

    }
    
}
