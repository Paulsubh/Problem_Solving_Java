package Arrays;

public class MaximumProductSubarray {
    public static int MaximumProdSubarray(int arr[]){
        int maxProd=arr[0];
        int minProd=arr[0];
        int result=arr[0];

        if(arr.length==0){
            return 0;
        }

        for(int i=1;i<arr.length;i++){
            int current=arr[i];

            if (current == 0) {
                maxProd = 0;
                minProd = 0;
                result = Math.max(result, 0);  // The result can be zero at least
            }
            if(current<0){
                int temp=maxProd;
                maxProd=minProd;
                minProd=temp;
            }
            maxProd=Math.max(current,maxProd*current);
            minProd=Math.min(current,minProd*current);

            result=Math.max(current,maxProd);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr1[]={1,2,-3,0,-4,-5};
        int arr2[]={1,-2,0,-4,5};
        System.out.println("The maximum product of the sub-array in first array is :"+MaximumProdSubarray(arr1));
        System.out.println("The maximum product of the sub-array in second array is :"+MaximumProdSubarray(arr2));
    }
    
}
