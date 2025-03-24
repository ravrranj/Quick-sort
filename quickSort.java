import java.util.Scanner;
import java.util.*;

public class quickSort {

    //Function to perform quick sort
    public static void quickSort (int arr[], int low, int high) {

        if(low < high) {
            //Find partition index 
            int pivotIndex = partition(arr, low, high);

            //Recursively sort left and right subarrays
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);

        }
    }
    // Function to partition the array
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high]; //Choosing last element as pivot
        int i = low - 1; // Index for smaller elements

        for ( int j = low; j < high; j++ ) {
            if (arr[j] < pivot) {  // if current element is smaller than pivot
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);  //Place pivot in correct position
        return i + 1; //Return pivot index 
    }

    // Function to swap two elements 
    public static void swap(int arr[],int i ,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(arr));
        quickSort(arr, 0, n -1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        
        sc.close();
    }

}