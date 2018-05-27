package ru.stqa.pft.sandbox;


//опреление простое число или нет.Простое число то, которое делится ьещ остатка только на себя и на единицу

public class Primes {


  public static boolean isPrime (int n)  {
    // вводим переменную i - и делим n for i по очереди. Если поделится без остатка на i, то число не простое
    for (int i = 2; i < n; i++) {
      if (n % i == 0){
        return false;
      }
    }
    return true;
  }
}
