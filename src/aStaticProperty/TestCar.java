package aStaticProperty;

public class TestCar {
    public static void main(String[] args) {

        Car car1 = new Car("Mazda 3","Skyactiv 3");

        System.out.println(Car.numberOfCar);
        car1.display();

        Car car2 = new Car("Mazda 6","Skyactiv 6");

        System.out.println(Car.numberOfCar);
        car2.display();

    }
}
