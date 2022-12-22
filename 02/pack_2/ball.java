package pack_2;

public class ball {
    private double x =0.0;
    private double y =0.0;

    public ball(double x, double y){
        setX(x);
        setY(y);
    };
    public ball(){};

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp){
        this.x+=xDisp;
        this.y+=yDisp;
    };
    @Override
    public String toString() {
        return "ball{" +
                "x=" + x +", y=" + y +
                '}';
    }



}
