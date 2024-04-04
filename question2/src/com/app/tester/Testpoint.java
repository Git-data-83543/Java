package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class Testpoint {

	public static void main(String[] args) {

		double x1, y1, x2, y2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of p1(x1,y1):");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		Point2D p1 = new Point2D(x1, y1);

		System.out.println("Enter the values of p2(x2,y2):");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		Point2D p2 = new Point2D(x2, y2);

		System.out.println("Details of point p1:" + p1.getDetails());
		System.out.println("Details of point p2:" + p2.getDetails());

		if (p1.isEqual(p2)) {
			System.out.println("Point p1 and p2 are in same position");
		} else {
			System.out.println("points p1 and p2 are in different location");
			double distance = p1.calculateDistance(p2);
			System.out.println("distance between point p1 and p2 is :" + distance);

		}
		sc.close();

	}

}
