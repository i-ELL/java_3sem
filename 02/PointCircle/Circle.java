package PointCircle;

public class Circle {
    private Point centre;
    private double r;

    public Circle(Point centre, double r){
        setCenter(centre);
        setR(r);
    }
    public void setCenter(Point centre){
        this.centre = centre;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public Point getCentre() {
        return centre;
    }
}
