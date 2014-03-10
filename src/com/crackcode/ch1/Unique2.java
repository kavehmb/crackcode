package com.crackcode.ch1;

import java.util.*;

public class Unique2 {

	public static void main(String[] Args) {

		HashMap<Character, Integer> results = new HashMap<Character, Integer>();
		results = numberOfChars("kaveh mirzaei badizi");

		for (char ch : results.keySet()) {
			System.out.println("key:" + ch + " value:" + results.get(ch));
		}

	}

	public static HashMap<Character, Integer> numberOfChars(String input) {

		HashMap<Character, Integer> table = new HashMap<Character, Integer>();
		for (char ch : input.toCharArray()) {

			if (table.get(ch) != null && table.get(ch) > 0)
				table.put(ch, table.get(ch) + 1);
			else
				table.put(ch, 1);

		}
		return table;
	}

}
