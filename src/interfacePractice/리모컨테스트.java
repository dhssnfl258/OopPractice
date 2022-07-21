package interfacePractice;

public class 리모컨테스트 {
    public static void main(String[] args) {

        삼성리모콘 삼성 = new 삼성리모콘();
        삼성.음악듣기();
        삼성.전원켜기();
        삼성.전원끄기();

        엘지리모콘 엘지 = new 엘지리모콘();
        엘지.reservation();
        코웨이리모콘 코웨이 = new 코웨이리모콘();
        코웨이.전원끄기();
        코웨이.전화받기();
    }
}
