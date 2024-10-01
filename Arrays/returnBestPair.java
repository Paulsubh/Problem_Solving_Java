package Arrays;
public class returnBestPair {
    public static int[] findPairs(int input1, int[] arr) {
        int maxProduct = 0;
        int targetSum = 18;
        int[] bestPair = new int[2]; // Initialize the best pair

        for (int i = 0; i < input1; i++) {
            for (int j = 0; j < input1; j++) {
                if (arr[i] + arr[j] == targetSum && arr[i]>arr[j]) {
                    int product = arr[i] * arr[j];
                    if (product > maxProduct) {
                        maxProduct = product;
                        bestPair[0] = arr[i];
                        bestPair[1] = arr[j];
                    }
                }
            }
        }
        return bestPair;
    }

    public static void main(String[] args) {
        int input1 = 8;
        int[] input2 = {11, 1, 2, 8, 10, 11, 15, 7}; // Correct array initialization
        int[] result = findPairs(input1, input2);

        System.out.println("The best pair is: " + "("+result[0] + "," + result[1]+")");
    }
    
}
