package interfacePractice;

public class 엘지리모콘 implements 리모콘{

    public void reservation(){
        System.out.println("resrvating!");
    }

    @Override
    public void 전원켜기() {
        System.out.println("LG off!");
    }

    @Override
    public void 전원끄기() {
        System.out.println("LG off!");
    }
}
