public class Rectangle implements CalcArea{
    private double W;//宽
    private double H;//高

    public Rectangle(double W,double H){
        this.H = H;
        this.W = W;
    }

    @Override
    public double getArea() {
        double area;
        area = H * W;
        return area;
    }

    
}
