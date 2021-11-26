package _bai6_kethua.bai_tap;

public class MovablePoint extends Point {
    public static void main(String[] args) {
 MovablePoint mova = new MovablePoint(5,6,8,9);
        System.out.println(mova.toString());

        mova.move();
        System.out.println(mova.toString());
        System.out.println();
    }
    public  float xSpeed ;
    public  float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public  float[] setSpeed( float xSpeed, float ySpeed)
    {
        float[]  Array = {this.xSpeed,this.ySpeed};
        return Array;
    }
    @Override
    public  String toString()
    {
        return "x: " + this.x + " va y :" + this.y + " va xSpeed" + this.xSpeed + " va ySpeed" + this.ySpeed;

    }
    public  MovablePoint move()
    {
        this.x  = this.xSpeed;
        this.y = this.ySpeed;
        return  this;
    }


}
