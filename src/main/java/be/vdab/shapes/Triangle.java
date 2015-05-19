package be.vdab.shapes;

public class Triangle extends Shape {
    public Triangle(String name) {
        super(name);
    }
    
    double shapeArea() {
		return 42;
	}

	@Override
	double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
}
