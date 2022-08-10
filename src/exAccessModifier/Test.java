package exAccessModifier;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập bán kính: ");
        double r1= sc.nextDouble();
Circle circle1 = new Circle(r1);
        System.out.println("New Circle: "+circle1.getColor()+ " có bán kính là:   "+circle1.getRadius());
        System.out.println("diện tích của hình tròn là: "+circle1.getArea());
    }
}
