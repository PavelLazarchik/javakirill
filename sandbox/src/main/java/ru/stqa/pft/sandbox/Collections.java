package ru.stqa.pft.sandbox;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Collections {
  public static void main(String[] args) {
    String[] langs = {"Java", "C£", "Python", "PHP"};

    for (int i = 0; i < langs.length; i++) {
      System.out.println("I would like to learn " + langs[i]);
    }

    List<String> lang = new ArrayList<String>();
    lang.add("Java 1");
    lang.add("C£ 1");
    lang.add("Python 1");
    lang.add("PHP 1");



    for (String l: lang){
      System.out.println("I would like to learn " + l);
    }
   }
}

