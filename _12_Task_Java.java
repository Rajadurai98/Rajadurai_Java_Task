package org.java;
//Question
/*"Write a program to generate the following output in java?
*
**
****
*****
******"*/
public class _12_Task_Java {
	public static void main(String[] args) {
		int row=5;
		for(int i=0;i<row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
