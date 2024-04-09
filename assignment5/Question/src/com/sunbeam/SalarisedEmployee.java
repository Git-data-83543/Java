package com.sunbeam;

import java.util.Scanner;

public class SalarisedEmployee extends Employee {
	private int weeklysalary;

	@Override
	public void calculateSalary() {
		System.out.println("weeklysalary;" + getWeeklysalary());

	}

	public int getWeeklysalary() {
		return weeklysalary;
	}

	// public void setWeeklysalary(int weeklysalary) {
	// this.weeklysalary = weeklysalary;
	// }

	@Override
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		super.acceptData();
		System.out.println("Enter the weekly salary:");
		weeklysalary = sc.nextInt();

	}

	@Override
	public void displyData() {

		super.displyData();

	}

}
