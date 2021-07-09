//Model class of Circle

package com.techlab.circle;

public class Circle {
	private float radius;
	private String color;
	private final float STRT_INDEX = 1.0f;
	private final float END_INDEX = 20.0f;
	private final String BLACK = "black";
	private final String BLUE = "blue";
	private final String GREEN = "green";
	private final String YELLOW = "yellow";

	public float getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	public void setRadius(float newradius) {
		if (newradius >= STRT_INDEX && newradius <= END_INDEX)
			radius = newradius;
		else if (newradius < STRT_INDEX)
			radius = STRT_INDEX;
		else
			radius = END_INDEX;

	}

	public void setColor(String newcolor) {
		if (newcolor.equals(BLACK) || newcolor.equals(GREEN) || newcolor.equals(BLUE))
			color = newcolor;
		else
			color = YELLOW;

	}

	public double AreaCircle() {
		return (3.142 * radius * radius);
	}

	public double ParimeterCircle() {
		return (2 * 3.142 * radius);
	}

}
