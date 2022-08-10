package aStaticProperty;

public class Car {
    public static int numberOfCar;
    private  String name;
    private String engine;



    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }
    void  display(){
        System.out.println("name: "+ name+"\n"+" động cơ "+engine);
    }
}
