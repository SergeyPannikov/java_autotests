package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("user");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

        /* Задание с 1 по 3 */
        Point p1 = new Point(1, 5);
        Point p2 = new Point(4, 9);
        System.out.println("Расстояние между точками " + "(" + p1.x + "," + p1.y + ")" + " и " + "(" + p2.x + "," + p2.y + ")" + " будет = " + distance(p1, p2));

        /* Задание 4 */
        System.out.println("Расстояние между точками " + "(" + p1.x + "," + p1.y + ")" + " и " + "(" + p2.x + "," + p2.y + ")" + " будет = " + Point.distance(p1, p2));
    }

    public static void hello(String somebody) {
        System.out.println("Hello," + somebody + "!");
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + (Math.pow(p2.y - p1.y, 2)));
    }
}