package oop1;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.width =5;
        r.height = 8;

        int area = r.calculateArea();
        System.out.println("넓이 : " + area);

        int peremeter = r.calculatePerimeter();
        System.out.println("둘레 길이 : " +peremeter);

       boolean square = r.isSquare();
        System.out.println("정사각형 여부 : " + square);
    }
}
