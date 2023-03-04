package Practise.StringHandling.OOPS;

public class Inherirance {
    int x;
    int y;

    public Inherirance(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int m1(int x, int y){

        return x+y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Inherirance inherirance = new Inherirance(10,10);
        inherirance.setX(10);
        inherirance.setY(10);
        inherirance.m1(inherirance.x , inherirance.y);

    }
}
