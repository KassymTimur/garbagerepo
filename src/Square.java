public class Square implements Shape{
    private double x;
    private String name = "Square";
    public Square(double x){
        this.x = x;
    }
    @Override
    public double getArea() {
        return x*x;
    }
    public double getPerimeter() {
        return 4*x;
    }
    public String getName(){
        return this.name;
    }
}
