package Practice;

public class 합계계산테스트 {
    public static void main(String[] args) {
        //오버로딩
        합계계산 계산1 = new 합계계산();

        System.out.println(계산1.더하기(1,2,3));
        System.out.println(계산1.더하기(1,2));
    }
}