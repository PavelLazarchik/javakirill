package ru.sftqa.pft.helmesframework.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionHelper {
  private ChromeDriver wd;

  public SessionHelper(ChromeDriver wd) {
    this.wd = wd;
  }
  public void login(String username, String password) {
    wd.findElement(By.id("ssousername")).click();
    wd.findElement(By.id("ssousername")).clear();
    wd.findElement(By.id("ssousername")).sendKeys(username);
    wd.findElement(By.id("password")).click();
    wd.findElement(By.id("password")).clear();
    wd.findElement(By.id("password")).sendKeys(password);
    wd.findElement(By.name("submit")).click();
  }

}
