package _bai6_kethua.bai_tap;

import java.lang.reflect.Array;

public class Point2D {
  public  float x;
  public  float y;

    public static void main(String[] args) {
        Point2D  pon2 = new Point2D(4,7);
        System.out.println(pon2.toString());
        pon2.setY(66);
        System.out.println(pon2.toString());
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y)
    {
        this.x = x;
        this.y= y;
    }
    public float[] getXY()
    {
        float[] array = {this.x,this.y};
        return array;
    }
    @Override
    public  String toString()
    {
        return " x :" + x +", y :" +y  + super.toString();
    }
}
