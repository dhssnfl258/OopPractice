package abstractPractice;

public class 원 extends 도형{
    int r;
    public 원(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public void drawing() {
        System.out.println("중심의 좌표값:::"+x+","+y);
        System.out.println("반지름:::"+ r);
    }
}
