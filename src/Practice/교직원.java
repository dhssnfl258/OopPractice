package Practice;

public class 교직원 extends 사람{
    public String 학교명;
    public long 번호;

    public 교직원(String 이름, long 번호, String 학교명, long 번호1) {
        super(이름, 번호);
        this.학교명 = 학교명;
        this.번호 = 번호1;
    }
    public void Output(){
        System.out.println(이름);
        System.out.println(번호);
        System.out.println(학교명);
        System.out.println(super.번호);
    }
}
