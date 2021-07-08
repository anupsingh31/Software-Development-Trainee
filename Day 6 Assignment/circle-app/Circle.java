//Model class of Circle

package com.techlab.circle;

public class Circle {
	private float radius;
	private String color = "YELLOW";

	public float getradius() {
		return radius;
	}

	public String getcolor() {
		return color;
	}

	public void setradius(float newradius) {
		if (newradius >= 1 && newradius <= 20)
			radius = newradius;
		else {
			System.out.println("Radius is not in range of 1 to 20");
			radius = 0.0f;
		}
	}

	public void setcolor(String newcolor) {
		if (newcolor == "black" || newcolor == "blue" || newcolor == "green")
			color = newcolor;
		else
			color = "yellow";

	}

	public double AreaCircle() {
		return (3.142 * radius * radius);
	}

	public double ParimeterCircle() {
		return (2 * 3.142 * radius);
	}

}
