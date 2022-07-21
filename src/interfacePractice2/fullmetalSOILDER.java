package interfacePractice2;

public class fullmetalSOILDER {
    public static void main(String[] args) {


        SSU ssu = new SSU();
        UDT udt = new UDT();
        HID hid = new HID();

        hid.walk();
        udt.IBS();
        ssu.IBS();
        ssu.walk();
        udt.walk();
    }
}
