package Practice;

public class 사람테스트 {
    public static void main(String[] args) {

        사람 사람1 = new 사람("이승재",111);
        System.out.println(사람1.이름);
        교직원 교직원1 = new 교직원("이승재",1111,"인하대", 2222);

        사람 사람2 = 교직원1;//업캐스팅;
        System.out.println(교직원1.get주민번호());
        System.out.println(교직원1.번호);

        사무직원 사무직원1 = new 사무직원("이승재",111,"인하대",122, "총무");

        사람 사람3 = 사무직원1;
        System.out.println(사람3.get주민번호());

        교직원1.Output();
        System.out.println();
        사람2.Output();
        사람2.get주민번호();
        사무직원1.Output();


    }
}
