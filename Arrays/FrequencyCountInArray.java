package Arrays;

import java.util.Arrays;

public class FrequencyCountInArray {
    public static void checkFrequency(int arr[]) {
        int n=arr.length;
        Arrays.sort(arr);
        int count = 1; // Variable to track the current element's frequency
        for (int i = 1; i < n; i++){ // Traverse the sorted array and count the frequency of each element
            if (arr[i] == arr[i - 1]) {
                count++;
            }else {
                System.out.println("Element:" + arr[i - 1] + " count:" + count);
                count = 1;
            }
        }
        System.out.println("Element: " + arr[arr.length - 1] + " frequency: " + count); // Print the frequency of the last element
    }

    public static void main(String[] args) {
        int arr[] = { 10, 10, 20, 50, 50, 60 };
        checkFrequency(arr);
    }

}
