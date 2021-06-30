public class Tester {
    // (1)
    static CalcArea[] shapes = { new Circle(1.0), new Rectangle(3.0, 4.0), new Circle(8.0) };

    public static void main(String[] args) {
        System.out.println("totle area=" + sumAras(shapes));
    }

    // (2)
    public static double sumAras(CalcArea[] shapes) {
        // (3)
        double total = 0;
        for (CalcArea items : shapes) {
            total += items.getArea();
        }
        return total;
    }
}
