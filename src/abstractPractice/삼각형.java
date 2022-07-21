package abstractPractice;

public class 삼각형 extends 도형{
    int width;
    int height;

    public 삼각형(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void drawing() {
        System.out.println("좌표값:::"+x+ "," + y);
        System.out.println("밑변,높이:::"+width+"," +height);
    }
}
