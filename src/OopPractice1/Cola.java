package OopPractice1;

public class Cola {
    private static int 용량 = 20;
    private int 제조일자 = 10; //명시적 초기화

    //블럭
    static{
        System.out.println("클래스 초기화 블럭");
        용량 = 40;
//        제조일자 = 50;//정적인 값을 초기화 하는부분이기 떄문에 에러
    }

    {
          System.out.println("인스턴스 초기화 블럭");
        용량 = 50;
        제조일자 = 50;

    }

    public Cola(){
        System.out.println("생성자 호출");
        용량 = 60;
        제조일자 = 40;
    }
}
