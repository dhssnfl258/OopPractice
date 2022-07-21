package interfacePractice;

public class 삼성리모콘 implements 리모콘{
    public void 음악듣기(){
        System.out.println("listening music!!");
    }
    @Override
    public void 전원켜기() {
        System.out.println("samsung on!");
    }

    @Override
    public void 전원끄기() {
        System.out.println("samsung off!");
    }
}
