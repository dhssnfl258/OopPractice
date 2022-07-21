package OopPractice1.InheritanceExample.InheritCar;

public class App {
    public static void main(String[] args) {
        System.out.println("InheritTest");
        Behicle behicle = new Behicle();
        behicle.name = "car";
        behicle.v = 123d;
        behicle.maximumPeople = 3;
        behicle.OutPut();
        System.out.println("=================");
        Car car = new Car();
        car.maximumPeople = 3;
        car.name = "hihi";
        car.v = 3;
        car.OutPut();
        car.OutPut();
        Car car1 = new Car(12,123,"100cc");
        car1.OutPut();
    }
}
