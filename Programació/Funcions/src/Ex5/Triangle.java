package Ex5;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    public void perimetre (){
        System.out.println(side1 + side2 + side3);
    }

    public void area(){
        double s = ((side1+ side2 + side3)/2);
        double area = Math.pow(s*(s-side1)*(s-side2)*(s-side3),2);
        System.out.println(area);
    }
}


