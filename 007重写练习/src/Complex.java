public class Complex {
    private int realPart;
    private int imaginPart;

    Complex() {
        this.realPart = 0;
        this.imaginPart = 0;
    }

    public Complex(int realPart, int imaginPart) {
        this.realPart = realPart;
        this.imaginPart = imaginPart;
    }

    public Complex complexAdd(Complex complex) {
        realPart += complex.getRealPart();
        imaginPart += complex.getImaginPart();
        return this;// 返回这个相加后的复数值
    }

    // 获取实部
    public int getImaginPart() {
        return imaginPart;
    }

    // 获取虚部
    public int getRealPart() {
        return realPart;
    }

    @Override
    public String toString() {
        return realPart + (imaginPart == 0 ? "" : (imaginPart < 0 ? "-" : "+") + Math.abs(imaginPart) + "i");
        // return f'';
    }
}