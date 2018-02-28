package ru.sftqa.pft.helmesframework.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationHelper {
  private ChromeDriver wd;

  public NavigationHelper(ChromeDriver wd) {
    this.wd = wd;

  }

  public void clickClaimManagerIcon() {
      wd.findElement(By.id("navigation-action-li-home")).click();
  }

  public void deleteTaskFromMoreMenu() {
      wd.findElement(By.linkText("Delete the task")).click();
  }

  public void openMoreMenu() {
     wd.findElement(By.xpath("//div[@class=' z-last z-cell']")).click();
  }
}
