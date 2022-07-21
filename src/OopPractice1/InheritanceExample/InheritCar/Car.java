package OopPractice1.InheritanceExample.InheritCar;

public class Car extends Behicle{
    public String name;
    public String 배기량;
    ///
    public Car(){
        super();
        System.out.println("car!!");
    }

    public Car(double v, int maximum, String 배기량){
        super(v,maximum);
        this.배기량 = 배기량;
        System.out.println("매개변수 생성자 호출!!");
    }

    public void OutPut(){
        System.out.println(super.name);
        System.out.println("name:::" + this.name);
        System.out.println("최대속도:::" + v);
        System.out.println("정원:::" + maximumPeople);
        System.out.println("배기량:::" + 배기량);
    }
}
