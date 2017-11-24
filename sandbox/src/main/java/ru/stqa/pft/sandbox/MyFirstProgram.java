package ru.stqa.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("World");
    hello("user");
    hello("Kirill");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    Point p1 = new Point(10, 15);
    Point p2 = new Point(20, 25);
    //double resultDistance = Point.distance(p1, p2);
    System.out.println("Расстояние между двумя точками, cо следующими координатами: ");
    System.out.println("по оси Х = " + p1.x + " и " + p1.y);
    System.out.println("по оси Y = " + p2.x + " и " + p2.y);
    System.out.println("равно = " + Point.distance(p1, p2));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }
}