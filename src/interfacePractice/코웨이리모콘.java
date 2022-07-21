package interfacePractice;

public class 코웨이리모콘 implements 리모콘, 전화기능{
    @Override
    public void 전원켜기() {
        System.out.println("coway on!");
    }

    @Override
    public void 전원끄기() {
        System.out.println("coway off!");
    }

    @Override
    public void 전화받기() {
        System.out.println(a);
    }
}
