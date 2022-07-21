package interfacePractice2;

public class SSU extends soilder implements Navy{

    @Override
    public void walk() {
        System.out.println("SSU walk!");
    }

    @Override
    public void IBS() {
        System.out.println("SSU with IBS!!");
    }
}
