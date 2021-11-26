package _bai6_kethua.thuc_hanh;

public class Rectangle extends Shape {
    private  double width= 1.0;
    private  double length= 1.0;

    public double getWidth() {
        return width;
    }
    public  Rectangle()
    {

    }
    public  Rectangle( double width, double length,boolean filled, String color)
    {
        super(color,filled);
        this.width = width;
        this.length = length;
    }


    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public  double getArea()
    {
        return width * length;
    }
    public  double getPerimeter()
    {
        return (width + length)*2;
    }
    @Override
    public  String toString()
    {
        return  " A Rectangle with width" + getWidth() +
                "length " +  getLength()+
                "which is a subclass of " + super.toString();
    }
}
