package org.java;

public class _02_Task_Java_Reverse_String_ {
	public static void main(String[] args) {
		String str="Rajadurai";
		String str1 = "";
		for(int i=str.length()-1;i>=0;i--) {
			 str1=str1+str.charAt(i);
			 
		}
		System.out.println(str1);
	}

}