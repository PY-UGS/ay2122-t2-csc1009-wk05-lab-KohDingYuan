
public class Circle extends Shape{
    public Circle(double dim1) {
        super(dim1, dim1);
    }
    public Circle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area(){
        return super.getPI() * Math.pow(super.getDim1(), 2);
    }
}
