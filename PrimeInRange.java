package org.BridgeLabs.AlgoritmProgrms;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeInRange 
{
	public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
	
	public static boolean isAnagram(int num)
	{
        String str = String.valueOf(num);
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sortedStr = new String(chars);
        for (int i = 2; i <= 1000; i++)
        {
            if (i != num && isPrime(i)) 
            {
                String otherStr = String.valueOf(i);
                char[] otherChars = otherStr.toCharArray();
                Arrays.sort(otherChars);
                String otherSortedStr = new String(otherChars);
                if (sortedStr.equals(otherSortedStr)) {
                    return true;
                }
            }
        }
        return false;
    }

	
	public static boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int count =0;
		System.out.println("Prime numbers between 0 and 1000 are:");
		 for(int i =0;i<=1000;i++)
		 {
			 if (isPrime(i) && isAnagram(i) && isPalindrome(i) ) 
			 {
	                System.out.print(i + " ");
	         }
		 }
	}

}
