package Practice;

public class 사람 {
    public String 이름;
    public long 번호;

    public 사람(String 이름, long 번호) {
        this.이름 = 이름;
        this.번호 = 번호;
    }
    public long get주민번호(){
        return 번호;
    }

    public void Output(){
        System.out.println(이름);
        System.out.println(번호);
        System.out.println();
    }
}
