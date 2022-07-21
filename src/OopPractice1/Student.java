package OopPractice1;

public class Student {
    private String name;
    public int age;
    public String sex;
    public String edu;
    public  Student(){
        System.out.println("기본생성자 사용");
    } //default 생성자
    public Student(String name) {
        this.name = name;
    }
    public Student(String name, int age){
        this(name); //this 생성자. 한번만 사용 가능
        this. age = age;
    }
    public Student(String name, int age, String sex){
//        this. name = name;
//        this. age = age;
        this(name,age);
        this. sex = sex;
    }
//생성자 오버로딩
    //하나의 클래스에서 인자가 다르면 생성자를 여러개 구현 가능.
    //시그니처가 달라야한다.
    //파라미터 값이 달라야 함.
    public Student(String name, String sex){
        this. name = name;
        this. age = age;
        this. sex = sex;
    }
//    public Student(String name, String edu){
//        this. name = name;
//        this. age = age;
//        this. edu = edu;
//    }
    public Student(String name, int age, String sex, String edu){
        this. name = name;
        this. age = age;
        this. sex = sex;
        this. edu = edu;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }
}
