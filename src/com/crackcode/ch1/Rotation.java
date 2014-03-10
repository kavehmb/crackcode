package com.crackcode.ch1;

public class Rotation {

	public static void main(String[] Args) {
		System.out.println(subRotation("apple", "leapp"));
	}

	public static boolean subRotation(String a, String b) {

		return ((a + a).contains(b));
	}

}