package org.BridgeLabs.AlgoritmProgrms;

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

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int count =0;
		System.out.println("Prime numbers between 0 and 1000 are:");
		 for(int i =0;i<=1000;i++)
		 {
			 if (isPrime(i)) 
			 {
	                System.out.print(i + " ");
	         }
		 }
	}

}
