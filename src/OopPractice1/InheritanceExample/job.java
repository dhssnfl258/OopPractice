package OopPractice1.InheritanceExample;

public class job extends People{

    String job;

    public job(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }
    @Override
    public void kk(){
        System.out.println("hihi");
        System.out.println("hihi");
        System.out.println("hihi");
    }
}
