package ru.stqa.pft.sandbox;

public class Collections {

  public static void main(String[] args) {
    String[] langs = {"Java", "C£", "Python", "PHP"};

    for (int i = 0; i < langs.length; i++) {
      System.out.println("I would like to learn " + langs[i]);
    }
  }
}
