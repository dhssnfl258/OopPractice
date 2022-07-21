package OopPractice1.InheritanceExample.InheritCar;
//자바에선 다중상속이 안된다.
//인터페이스를 통해 다중상속 구현.
public class Behicle {
    String name = "차량";
    double v;
    int maximumPeople;

    public Behicle(double v, int maximumPeople){
        this.v= v;
        this. maximumPeople = maximumPeople;
        System.out.println("자동차의 매개변수를 받는 생성자 호출~~");
    }
    public Behicle(){
        System.out.println("Behicle!!");
    }
    public void OutPut(){
        System.out.println("name:::" + name);
        System.out.println("최대속도:::" + v);
        System.out.println("정원:::" + maximumPeople);
    }
}
