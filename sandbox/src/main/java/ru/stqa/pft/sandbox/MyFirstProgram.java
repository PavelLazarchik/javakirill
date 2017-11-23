package ru.stqa.pft.sandbox;

import com.sun.org.apache.xpath.internal.SourceTree;

public class MyFirstProgram {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    Rectangle r = new Rectangle(4, 6);
    System.out.println("Rectangle  with parts " + r.a + " and" + r.b + " = " + area(r));

    Square s = new Square(7);
    System.out.println("Square with parts " + s.a + " = " + area(s));
  }

  public static double area(Rectangle r) {
    return r.a * r.b;
  }

  public static int area(Square s) {
    return  s.a * s.a;
  }

}
