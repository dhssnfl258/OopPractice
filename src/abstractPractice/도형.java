package abstractPractice;

public abstract class 도형 {

    protected int x;
    protected int y;

    public 도형(int x, int y){
        this.x = x;
        this.y = y;
    }

    public abstract void drawing();

}
