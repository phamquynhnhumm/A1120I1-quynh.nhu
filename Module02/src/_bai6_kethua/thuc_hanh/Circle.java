package _bai6_kethua.thuc_hanh;

import com.sun.xml.internal.ws.util.MetadataUtil;

import java.awt.*;

public class Circle extends Shape{
    private double radius = 1.0;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
   public  Circle(double radius, String color, boolean filled)
   {
       super(color,filled);
       this.radius = radius;
   }
    @Override
    public String getColor() {
        return super.getColor();
    }
    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }
    @Override
    public  void  setFilled(boolean filled)
    {
        super.setFilled(filled);
    }
    public double getArea()
    {
        return  radius * radius * Math.PI;
    }
    public double getPerimeter()
    {
        return 2* radius * Math.PI;
    }
    @Override
    public  String toString()
    {
        return "A circle with  radius=" + getRadius()
                +", Which is a subclass of" + super.toString();
    }
}
