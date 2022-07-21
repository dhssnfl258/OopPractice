package CastingExample;

public class 과일테스트 {
    public static void main(String[] args) {

        과일 과일1 = new 과일();
        과일 과일2 = new 바나나();
        //바나나는 과일을 상속받았다
        //바나나를 업캐스팅해서 과일에 담을 수 있다.
        과일 과일3 = new 사과();
        과일[] 과일리스트 = {과일3, 과일1, 과일2};
        for(과일 i:과일리스트){
            if(i instanceof 바나나){
                System.out.println("바나나");
            }
            else if(i instanceof 사과){
                System.out.println("사과");
            }else if(i instanceof 과일){
                System.out.println("다른 과일입니다.");
            }else{
                System.out.println("과일 아님");
            }
        }
    }
}
