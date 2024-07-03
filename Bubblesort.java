package org.BridgeLabs.AlgoritmProgrms;

public class Bubblesort 
{

	public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, then break
            if (!swapped) {
                break;
            }
        }
    }

	public static void printArray(int a[]) {
        for (int i=0;i<a.length;i++) 
        {
            System.out.print(a[i] + " ");
        }
        
    }
	
	public static void main(String[] args) 
	{
		int[] numbers = { 64, 34, 25, 12, 22, 11, 90 };

        System.out.println("Original Array:");
        printArray(numbers);

        // Perform Bubble Sort
        bubbleSort(numbers);

        System.out.println("\nSorted Array:");
        printArray(numbers);
	}

}
