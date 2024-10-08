package M01.Assignment4;

public class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon(){};

    public RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
    }

    public RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    //accessors
    public int getN(){
        return n;
    }

    public double getSide(){
        return side;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    //mutators
    public void setN(int n){
        this.n = n;
    } 

    public void setSide(double side){
        this.side = side;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    //methods
    public double getPerimeter(){
        return side * n;
    }

    public double getArea(){
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}
