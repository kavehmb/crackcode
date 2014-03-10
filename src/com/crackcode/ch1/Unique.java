package com.crackcode.ch1;

import java.util.*;

public class Unique {

	public static void main(String[] Args) {
		HashMap<Character, Integer> test = new HashMap<Character, Integer>();
		test = checkChar("salam azizam azizam salam dooset daram");

		for (char ch : test.keySet()) {
			System.out.println("key:" + ch + " value:" + test.get(ch));
		}

		// System.out.println("salam");
	}

	public static HashMap<Character, Integer> checkChar(String input) {

		HashMap<Character, Integer> table = new HashMap<Character, Integer>();
		for (char ch : input.toCharArray()) {
			if (!table.containsKey(ch)) {
				table.put(ch, 1);
			} else {
				table.put(ch, table.get(ch) + 1);
			}

		}
		return table;
	}
}