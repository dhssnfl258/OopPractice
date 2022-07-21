package interfacePractice2;

public class UDT extends  soilder implements Navy{
    @Override
    public void walk() {
        System.out.println("UDT walk!");
    }

    @Override
    public void IBS() {
        System.out.println("UDT use IBS!!");
    }
}
