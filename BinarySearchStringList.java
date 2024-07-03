package org.BridgeLabs.AlgoritmProgrms;

import java.util.Arrays;

public class BinarySearchStringList
{
	
	public static void main(String[] args) 
	{
		String s = "java is High level programming language used to build applications";
		String str[] = s.split(" ");
		
		if (str == null) 
		{
            System.out.println("Failed to read words from file.");
            return;
        }
		
		Arrays.sort(str);
		String searchWord = "level";
		
		int index = Arrays.binarySearch(str, searchWord);
		
		if (index >= 0) {
            System.out.println("Word '" + searchWord + "' found in the list.");
        } else {
            System.out.println("Word '" + searchWord + "' not found in the list.");
        }
	}
}