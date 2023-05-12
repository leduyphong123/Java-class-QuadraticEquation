public class QuadraticEquation {
    private double a, b, c, denta;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return this.a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return this.b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        this.denta = b * b - 4 * a * c;
        return this.denta;
    }

    public double getRoot1() {
        if (this.denta < 0) {
            return 0;
        } else {
            double r1 = (-this.b + Math.pow(this.denta, 0.5)) / (2 * this.a);
            return r1;
        }
    }

    public double getRoot2() {
        if (this.denta < 0) {
            return 0;
        } else {
            double r2 = (-this.b - Math.pow(this.denta, 0.5)) / (2 * this.a);
            return r2;
        }
    }
}
