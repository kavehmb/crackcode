package com.crackcode.ch1;

import java.util.*;

public class Replace {

	public static void main(String[] Args) {
		System.out.println(replace("kavehmb salam"));
	}

	public static String replace(String input) {

		char[] out = input.toCharArray();

		String output = "";
		for (char x : input.toCharArray()) {
			if (x == ' ') {
				output += "%20";
			} else {
				output += x;
			}
		}

		return output;
	}
}
