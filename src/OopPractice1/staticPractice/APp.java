package OopPractice1.staticPractice;

public class APp {
    public static void main(String[] args) {

        Circle circle = new Circle(10);
        System.out.println("원의 넓이:::" + circle.getArea());
        System.out.println("원의 둘레:::" + circle.getPerimeter());

        Circle circle2 = new Circle(10);
        System.out.println("원의 넓이:::" + circle2.getArea());
        System.out.println("원의 둘레:::" + circle2.getPerimeter());
    }
}
