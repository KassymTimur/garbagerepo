class Rectangle implements Shape{
    private double x,y;
    private String name = "Rectangle";
    @Override
    public double getArea() {
        return x*y;
    }
    public double getPerimeter() {
        return (x+y)*2;
    }
    public String getName() {
        return this.name;
    }

}