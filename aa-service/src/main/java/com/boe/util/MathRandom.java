package com.boe.util;

public class MathRandom {

	public static int random(int max,int min) {
		int result = min + (int)(Math.random() * ((max-min) + 1));
		return result;
	}
}
