package com.crackcode.ch1;

public class Anagrams {

	public static void main(String[] Args) {
		if (anagrams("kaveh", "kavhe"))
			System.out.println("YES");
		else
			System.out.println("NO");

	}

	public static boolean anagrams(String input1, String input2) {

		int[] a = histogram(input1);
		int[] b = histogram(input2);

		for (int i = 0; i < 256; i++) {
			if (a[i] != b[i])
				return false;
		}
		return true;

	}

	public static int[] histogram(String input) {

		int[] characters = new int[256];

		for (char ch : input.toCharArray()) {
			int var = (int) ch;
			characters[var]++;
		}
		return characters;
	}

}
