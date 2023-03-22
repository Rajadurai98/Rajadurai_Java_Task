package org.java;

// Task 05 java----Write a program to demonstrate method overriding?
class parent {
	public void method1() {
          System.out.println("method1");
	}
}

public class _05_Task_Java_Method_Overriding {
	public void method1() {
		System.out.println("method1");
	}

	public static void main(String[] args) {
		_05_Task_Java_Method_Overriding obj= new _05_Task_Java_Method_Overriding();
		obj.method1();
	}
}
