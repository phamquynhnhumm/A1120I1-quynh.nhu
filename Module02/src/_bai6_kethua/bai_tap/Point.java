package _bai6_kethua.bai_tap;

public class Point {
    public static void main(String[] args) {
         Point point  = new Point(3,7);
        System.out.println(point.toString());

        point.setX(8);
        point.setY(70);
        System.out.println(point.toString());

    }
    public  float x;
    public float y;

    public Point(float x, float y) {
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
    public  void  setXY(float x, float y)
    {
        this.x = x;
        this.y = y;
    }
    public  float[] getXY()
    {
        float[] Array ={this.x,this.y};
        return  Array;
    }
    @Override
    public  String toString()
    {
        return "x: "  + this.x + " và y :" +this.y ;
    }

}
