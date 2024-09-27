public class Circle implements Shape {
    private double radius;
    private String name = "Circle";
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public double getArea() {
        return Math.PI*radius*radius;
    }
    public String getName() {
        return this.name;
    }
}
