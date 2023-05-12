import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Giai phuong tring bac 2 aX2 +bX +c = 0");
        System.out.print("Nhap a = ");
        double a = input.nextDouble();
        System.out.print("Nhap b = ");
        double b = input.nextDouble();
        System.out.print("Nhap c = ");
        double c = input.nextDouble();
        QuadraticEquation pt = new QuadraticEquation(a, b, c);
        QuadraticEquation pt2 = new QuadraticEquation();
        pt2.setA(a);
        pt2.setB(b);
        pt2.setC(c);
        System.out.println("pt dent = " + pt.getDiscriminant());
        System.out.println("pt x1 = " + pt.getRoot1());
        System.out.println("pt x2 = " + pt.getRoot2());
        System.out.println("pt2 dent = " + pt2.getDiscriminant());
        System.out.println("pt2 x1 = " + pt.getRoot1());
        System.out.println("pt2 x2 = " + pt.getRoot2());

    }
}