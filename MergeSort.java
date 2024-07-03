package org.BridgeLabs.AlgoritmProgrms;

import java.util.Arrays;

public class MergeSort 
{
	public static void mergeSort(String[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Base case: array is already sorted or empty
        }

        // Calculate mid index
        int mid = arr.length / 2;

        // Create left and right subarrays
        String[] left = Arrays.copyOfRange(arr, 0, mid);
        String[] right = Arrays.copyOfRange(arr, mid, arr.length);

        // Recursively sort the left and right subarrays
        mergeSort(left);
        mergeSort(right);
     // Merge the sorted left and right subarrays into arr
        merge(arr, left, right);
    }
	// Merge two sorted arrays left and right into arr
    private static void merge(String[] arr, String[] left, String[] right) {
        int i = 0, j = 0, k = 0;

        // Merge left and right into arr
        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements of left and right if any
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
    
	public static void PrintArray(String a[]) 
	{
        for (int i=0;i<a.length;i++) 
        {
            System.out.print(a[i] + " ");
        }
        
    }
	public static void main(String[] args) 
	{
		String[] words = { "banana", "apple", "orange", "grape", "pineapple" };

        System.out.println("Original Array:");
        PrintArray(words);

        // Perform Merge Sort
        mergeSort(words);

        System.out.println("\nSorted Array:");
        PrintArray(words);

	}

}
