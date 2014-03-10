package com.crackcode.ch1;

import java.util.*;

public class Duplicate {

	public static void main(String[] Args) {

		System.out
				.println(removeDuplicateString("xxxyabcdyy"));

		System.out.println(removeDuplicateChar("xxxyabcdyy"));
	}

	public static String removeDuplicateChar(String input) {

		char[] inp = input.toCharArray();
		char[] out = new char[inp.length];
		int k = 0;
		for (int i = 0; i < inp.length; i++) {
			boolean found = false;
			for (int j = 0; j <= k; j++) {
				// System.out.println(out[k]);
				if (inp[i] == out[j]) {
					found = true;
					break;
				}
			}
			if (!found) {
				k++;
				out[k] = inp[i];
			}
		}

		return String.valueOf(out);
		// return "END";
	}

	public static String removeDuplicateString(String input) {
		HashSet<Character> hash = new HashSet<Character>();

		String output = "";

		for (char ch : input.toCharArray()) {
			if (!hash.contains(ch)) {
				hash.add(ch);
				output += ch;
			}
		}

		return output;
	}
}
