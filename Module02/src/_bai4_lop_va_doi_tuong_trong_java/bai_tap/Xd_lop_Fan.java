package _bai4_lop_va_doi_tuong_trong_java.bai_tap;

import jdk.nashorn.internal.runtime.regexp.joni.SearchAlgorithm;

public class Xd_lop_Fan {
    public static void main(String[] args) {
        Xd_lop_Fan fan1 = new Xd_lop_Fan();
        Xd_lop_Fan fan2 = new Xd_lop_Fan();
        fan1.setSpeed(3);
        fan1.setColor("yellow");
        fan1.setRadius(10);
        fan1.setOn(true);
        fan2.setSpeed(2);
        fan2.setColor("blue");
        fan2.setRadius(5);
        fan2.setOn(false);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
    final int SLOW = 1;
    final  int  MEDIUM = 2;
    final  int FAST = 3;
    private  int speed = SLOW;
    private  boolean  on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public  String toString()
    {
        if(isOn())
        {
            return this.speed + this.radius + this.radius  + "Fan is on";
        }
        else return  this.color + this.radius + "Fan is off";
    }

}
