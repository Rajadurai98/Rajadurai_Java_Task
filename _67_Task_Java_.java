package org.java;
//Questions
//Check no is Armstrong or not in java Program
public class _67_Task_Java_ {
	public static void main(String[] args) {
		int num=153,r,sum = 0;
		int temp=num;
		while(num>0) {
			r=num%10;
			sum=sum+r*r*r;
			num=num/10;
		}
		if(sum==temp) {
			System.out.println("its is a Armstrong");
		}
		else {
			System.out.println("not an Armstrong");
		}
	}

}
