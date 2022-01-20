
class Shape{

	double area;

	void area(int val){

	area = 3.14 * val * val;

	System.out.println("Area of Circle = "+area);		
	}

	//Method Overloading
	void area(int l, int b){ 

	area = l*b;
	
	System.out.println("Area of rectangle = "+area);
	}
}

class Square extends Shape{

	//Method Overriding
	void area(int val){
	
	area = val*val;
	
	System.out.println("Area of square = "+area);
	}
}

class Polymorphism{

	public static void main(String args[]){

	Shape s= new Shape();

	Square sq= new Square();

	s.area(4);
	s.area(5,7);

	sq.area(3);
	}
}