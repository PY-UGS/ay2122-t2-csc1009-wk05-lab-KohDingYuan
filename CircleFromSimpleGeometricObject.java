
public class CircleFromSimpleGeometricObject extends GeometricObject{
    private double radius;

    public CircleFromSimpleGeometricObject() {
    }
    public CircleFromSimpleGeometricObject(double radius) {
        this.radius = radius;
    }
    public CircleFromSimpleGeometricObject(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return (Math.PI * Math.pow(this.radius, 2));
    }
    public double getPerimeter(){
        return (Math.PI * this.radius * 2);
    }
    public double getDiameter(){
        return this.radius * 2;
    }
}
