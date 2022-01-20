

abstract class Shape{


	void display(String shape){

		System.out.println("Shape = "+shape);	
	}
	
	abstract void circleArea(int radius);
	
	abstract void squareArea(int side);
		
	abstract void rectangleArea(int length, int breadth);
	
}

interface Perimeter{

	void circumference(int radius);
	void perimeterRectangle(int l, int b);
	void perimeterSquare(int l);
}

class Area extends Shape implements Perimeter{

	void circleArea(int radius){

		Double area= 3.14 * radius*radius;
	
		display("Circle");	
		
		System.out.println("Area = "+area);
	}

	public void circumference(int radius){

		
		System.out.println("Circumference = "+ (2 * 3.14 * radius)+"\n");
	}
	
	void squareArea(int sides){

		int area= sides*sides;

		display("Square");
	
		System.out.println("Area = "+area);
	}

	public void perimeterSquare(int l){

		System.out.println("Perimeter = "+(4 * l)+"\n");
	}

	void rectangleArea(int length, int breadth){

		int area=length*breadth;

		display("Rectangle");
	
		System.out.println("Area = "+area);
	}

	public void perimeterRectangle(int l, int b){

		System.out.println("Perimeter = "+ 2*(l*b));
	}

}

class Abstraction{

	public static void main(String arg[]){

		Area obj = new Area();
	
		obj.circleArea(3);
		obj.circumference(3);

		obj.squareArea(5);
		obj.perimeterSquare(5);

		obj.rectangleArea(4,8);
		obj.perimeterRectangle(4,8);
	}
}
