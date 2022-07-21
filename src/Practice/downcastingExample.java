package Practice;

import org.w3c.dom.ls.LSOutput;

public class downcastingExample {

    public static void main(String[] args) {

        사람 남자 = new 사람("이승재",1111);

        System.out.println("이름:::" + 남자.이름 + ", 주민번호:::" + 남자.번호);

//        교직원 교직원1 = 남자;//컴파일 에러
//        교직원 교직원2 = (교직원) 남자;

        //다운캐스팅
        교직원 남자교직원 = new 교직원("승승", 1111, "인하대", 222);
        System.out.println("이름:::"+남자교직원.이름+", 학교명:::" + ((사람)남자교직원).번호);
        사람 남자사람 = 남자교직원; //업캐스팅
        System.out.println("이름:::" + 남자사람.이름);
//        System.out.println("학교명:::" + 교직원2.학교명);

        교직원 남자교직원2 = (교직원)남자사람;
        System.out.println(남자교직원2.번호);
    }
}
