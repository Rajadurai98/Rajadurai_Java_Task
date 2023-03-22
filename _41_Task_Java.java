package org.java;

public class _41_Task_Java {
	public static void main(String[] args) {
		int a = 10, b = 20, temp;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("after swap value a is " + a);
		System.out.println("after swap value a is " + b);
	}

}
