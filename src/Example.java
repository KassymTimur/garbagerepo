public class Example {
    public static void main(String[] args) {
        Rectangle a = new Square(2.4); //this is wrong; we don't need to put width into "square", since all sides are the same
        Rectangle b = new Rectangle(6);
        System.out.println(a.area());
        System.out.println(b.area());
    }
}
