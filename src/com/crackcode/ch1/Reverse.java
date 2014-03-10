package com.crackcode.ch1;

public class Reverse {

	public static void main(String[] Args) {
		System.out.println(reverse("kaveh"));

	}

	public static String reverse(String input) {

		String output="";

		for (int i = input.length(); i > 0; i--)
			output += input.charAt(i - 1);

		return output;
	}
}
