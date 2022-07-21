package Practice;

public class instanceofTest {
    public static void main(String[] args) {


        사람 남자 = new 사람("이승재",111);
        교직원 남자교직원 = new 교직원("이승재", 1111, "인하대", 1234);

        //남자 -> 사람
        //남자교직원 ->교직원, 사람

        System.out.println("남자 instanace of 사람::::" + (남자 instanceof 사람));
        System.out.println("남자 instanace of 교직원:::" + (남자 instanceof 교직원));
        System.out.println("남자교직원 instanace of 사람:::" + (남자교직원 instanceof 사람));
        System.out.println("남자교직원 instanace of 교직원:::" + (남자교직원 instanceof 교직원));
    }
}
