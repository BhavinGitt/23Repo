package homeworkJAVA;

import java.util.Arrays;

public class Shape {

	private int lentgh;
	private int width;
	private double area;
	private int area1;
	final double PI_VALUE = 3.14;

	
	public Shape() {

	}

	public Shape(int lentgh) {
		this.lentgh = lentgh;
	}

	public Shape(int lentgh, int width) {
		this.lentgh = lentgh;
		this.width = width;
	}

	public int getAreaRectangle(int lentgh, int width) {
		return area1 = lentgh * width;
	}

	public int getAreaSqaure(int lentgh)
	{
		return area1 = lentgh * lentgh;
	}

	public double getAreaCircle(double width) {
		width = (width * width);
		return area = width * PI_VALUE;
	}

	/* --------------------NOT REQUIRED---------------------------
	 * public int getLentgh() { return lentgh; }
	 * 
	 * public void setLentgh(int lentgh) { this.lentgh = lentgh; }
	 * 
	 * public int getWidth() { return width; }
	 * 
	 * public void setWidth(int width) { this.width = width; }
	 --------------------NOT REQUIRED---------------------------*/
}

class Shape1 {

	public static void main(String[] args) {

		Shape circleArea = new Shape();
		System.out.println(circleArea.getAreaCircle(5));

		Shape sqaureArea = new Shape();
		System.out.println(sqaureArea.getAreaSqaure(5));

		Shape rectangleArea = new Shape();
		System.out.println(sqaureArea.getAreaRectangle(5, 6));

		Shape[] shapeArray = { circleArea, sqaureArea, rectangleArea };
		System.out.println(shapeArray.length);
       
	//we were tried for ascending and descending separation of array but NOT get yet will give you reply once get it.
	
	}

}
