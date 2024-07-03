package org.BridgeLabs.AlgoritmProgrms;

public class InsertionSort 
{
	public static void insertionSort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            String key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
	
	public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

	public static void main(String[] args) 
	{
		String[] words = { "banana", "apple", "orange", "grape", "pineapple" };

        System.out.println("Original Array:");
        printArray(words);

        // Perform Insertion Sort
        insertionSort(words);

        System.out.println("\nSorted Array:");
        printArray(words);

	}

}
