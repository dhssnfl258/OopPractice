package OopPractice1.InheritanceExample;

public class App {
    public static void main(String[] args) {

        System.out.println("test!!");
        People people = new People("j", 12);
        job job = new job("a", 12 ,"asd");

        String a = job.name;
        System.out.println(a);
        job.kk();
        people.kk();
    }
}
