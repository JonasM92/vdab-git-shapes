package be.vdab.shapes;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "The perimeter of this shape is: " + this.perimeter();
    }
    
    abstract double perimeter();
    
    
}
