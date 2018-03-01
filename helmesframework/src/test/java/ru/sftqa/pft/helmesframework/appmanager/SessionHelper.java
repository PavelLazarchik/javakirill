package ru.sftqa.pft.helmesframework.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionHelper extends HelperBase {


  public SessionHelper(ChromeDriver wd) {
    super(wd);
  }
  public void login(String username, String password) {
    type(By.id("ssousername"),username);
    type(By.id("password"),password);
    click(By.name("submit"));
     }

}
