package OopPractice1;

public class StuentTest {
    public static void main(String[] args) {
        Student student = new Student("name");
        Student student1 = new Student();
        Student student2 = new Student("jae", 12, "male", "computerScience");
        Student student3 = new Student("jj",12, "fe");
        Student student4 = new Student();

        System.out.println(student.getSex());
        System.out.println();
    }
}
