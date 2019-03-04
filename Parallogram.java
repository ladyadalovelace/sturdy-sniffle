public class Parallogram { 

    private double base, height;
    private double angles[];


    public Parallogram(double b, double h, double[] a) { 
        base = b;
        height = h;
        angles = a;
    }


    public double getArea() {
        return height * base;
    }

    public double getBase() { return base;}
    public double getHeight() { return height; }



}