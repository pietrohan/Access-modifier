package exAccessModifier;

public class Circle {
    private double radius =1.0;
    private String color = "red";

    public Circle(double r) {
        this.radius = r;
    }
    public  Circle(){
    }
    public  double getRadius(){
        return this.radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return Math.PI * radius*radius;
}
}
