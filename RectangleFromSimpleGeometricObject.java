
public class RectangleFromSimpleGeometricObject extends GeometricObject{
    private double width;
    private double height;

    public RectangleFromSimpleGeometricObject() {
    }
    public RectangleFromSimpleGeometricObject(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public RectangleFromSimpleGeometricObject(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width * 2) + (this.height * 2);
    }
}