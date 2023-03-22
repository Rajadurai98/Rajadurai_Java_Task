package org.java;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
//Write a Program to remove duplicates in an ArrayList.
public class _05_Task_Java {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(11);
		numbers.add(11);
		numbers.add(13);
		numbers.add(13);
		numbers.add(14);
		System.out.println("ArrayList with duplicate elements: " + numbers);

		Set<Integer> set = new LinkedHashSet<>();
		set.addAll(numbers);

		numbers.clear();

		numbers.addAll(set);
		System.out.println("ArrayList without duplicate elements: " + numbers);
	}
}