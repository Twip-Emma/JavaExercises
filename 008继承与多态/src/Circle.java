public class Circle implements CalcArea{
    private double R;


    public Circle(double R){
        this.R = R;
    }


    @Override
    public double getArea() {
        double area;
        area = R * R * Math.PI;
        return area;
    }

    
}
