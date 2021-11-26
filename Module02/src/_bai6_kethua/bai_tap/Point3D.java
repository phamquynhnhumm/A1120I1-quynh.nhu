package _bai6_kethua.bai_tap;

import javax.swing.*;

public class Point3D extends Point2D {
    public static void main(String[] args) {
        Point3D pon3 = new Point3D(3,5,6);
        System.out.println(pon3.toString());
        pon3.setX(6);
        pon3.setY(6);
        System.out.println(pon3.toString());


    }
    public  float z;

    public float getZ() {
        return z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z)
    {
        this.x = this.x;
        this.y = this.y;
        this.z = this.z;
    }
    public  float[] getXYZ()
    {
        float[] array = {this.x,this.y,this.z};
        return array;
    }
    @Override
    public  String toString()
    {
        return  "x: "  + this.x + " va y :" + this.y +"va z = " + this.z;
    }

}
