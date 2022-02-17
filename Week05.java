
public class Week05{
    public void tutQuestion01(){
        CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(1);
        System.out.println(
            "A circle " + circle.toString() + 
            "\nThe color is " + circle.getColor() + " and filled: " + circle.isFilled() +
            "\nThe radius is " + circle.getRadius() +
            "\nThe area is " + circle.getArea() +
            "\nThe diameter is " + circle.getDiameter());

        RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(2, 4);
        System.out.println(
            "A rectangle " + rectangle.toString() + 
            "\nThe color is " + rectangle.getColor() + " and filled: " + rectangle.isFilled() +
            "\nThe area is " + rectangle.getArea() +
            "\nThe perimeter is " + rectangle.getPerimeter());
    }
    public void tutQuestion02(){
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Circle c = new Circle(5);
        Ellipse e = new Ellipse(7, 7);
        Square s = new Square(6);
        Shape figref;

        figref = r;
        System.out.println(
            "Inside Area for Rectangle.\n" +
            "Area is " + figref.area());

        figref = t;
        System.out.println(
            "Inside Area for Triangle.\n" +
            "Area is " + figref.area());

        figref = c;
        System.out.println(
            "Inside Area for Circle.\n" +
            "Area is " + figref.area());

        figref = e;
        System.out.println(
            "Inside Area for Ellipse.\n" +
            "Area is " + figref.area());

        figref = s;
        System.out.println(
            "Inside Area for Square.\n" +
            "Area is " + figref.area());
    }
}