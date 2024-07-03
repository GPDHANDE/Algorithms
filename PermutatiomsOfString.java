package org.BridgeLabs.AlgoritmProgrms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutatiomsOfString 
{
	public static String[] GetIterativePermutations(String str) {
        List<String> permutations = new ArrayList<>();
        permutations.add(str);

        for (int i = 0; i < str.length(); i++) {
            List<String> newPermutations = new ArrayList<>();
            for (String p : permutations) {
                for (int j = 0; j <= p.length(); j++) {
                    newPermutations.add(insertChar(p, str.charAt(i), j));
                }
            }
            permutations = newPermutations;
        }

        return permutations.toArray(new String[0]);
    }

	public static String[] GetRecursivePermutations(String str) {
        List<String> permutations = new ArrayList<>();
        getPermutationsRecursive(str, "", permutations);
        return permutations.toArray(new String[0]);
    }

    private static void getPermutationsRecursive(String str, String prefix, List<String> permutations) {
        if (str.length() == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String newStr = str.substring(0, i) + str.substring(i + 1);
                getPermutationsRecursive(newStr, prefix + str.charAt(i), permutations);
            }
        }
    }


    private static String insertChar(String str, char c, int pos) {
        return str.substring(0, pos) + c + str.substring(pos);
    }
	public static void main(String[] args) 
	{
		String str ="abc";
		String iterativePermutations [] = GetIterativePermutations(str);
		String recursivePermutations [] =GetRecursivePermutations(str);
		
		Arrays.sort(iterativePermutations);
        Arrays.sort(recursivePermutations);

        System.out.println("Iterative permutations: " + Arrays.toString(iterativePermutations));
        System.out.println("Recursive permutations: " + Arrays.toString(recursivePermutations));

        System.out.println("Are the two arrays equal? " + Arrays.equals(iterativePermutations, recursivePermutations));

	}

}
