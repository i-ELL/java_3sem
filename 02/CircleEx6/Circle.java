package CircleEx6;

public class Circle {
    private double c_x;
    private double c_y;
    private double r;

    public Circle(double x, double y, double r){
        setC_x(x);
        setC_y(y);
        setR(r);
    }
    public void setR(double r) {
        this.r = r;
    }

    public void setC_x(double c_x) {
        this.c_x = c_x;
    }

    public void setC_y(double c_y) {
        this.c_y = c_y;
    }

    public double getC_x() {
        return c_x;
    }

    public double getC_y() {
        return c_y;
    }

    public double getR() {
        return r;
    }
    public double Area(){
        return r*r*Math.PI;
    }
    public double Per(){
        return 2*Math.PI*r;
    }

    public boolean Equals(Circle one){
        if ((this.r == one.r) && (this.c_x == one.c_x) && (this.c_y == one.c_y)) return true;
        else return false;
    }
}
