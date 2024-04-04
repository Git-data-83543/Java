package com.app.geometry;

public class Point2D {
	private double x1;
	private double y1;
	private double x2;

	public Point2D(double x1, double y1) {
		this.x1 = x1;
		this.y1 = y1;

	}

	public String getDetails() {
		String result;
		result = x1 + "," + y1;
		return result;
	}

	public boolean isEqual(Point2D p2) {
		if (this.x1 == p2.x1 && this.y1 == p2.y1) {
			return true;
		}
		return false;
	}

	public double calculateDistance(Point2D p2) {
		double distance;
		distance = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
		return distance;
	}

	public double getX2() {
		return x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

}