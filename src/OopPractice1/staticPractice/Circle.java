package OopPractice1.staticPractice;

public class Circle {
    double radius; // 반지름 고정값x
    static double PI = 3.141592; // 파이 고정값
    //고정값을 사용할때에는 메모리사용을 줄이기 위한 방법으로 static을 사용한다.
    //static 값은 대문자로 사용한다.
    public Circle(double radius){
        this.radius = radius;
    }

    public  double getArea(){
        return PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * PI * radius;
    }


    //원 넓이, 둘레
    // pi R^2
    // 2piR

}
