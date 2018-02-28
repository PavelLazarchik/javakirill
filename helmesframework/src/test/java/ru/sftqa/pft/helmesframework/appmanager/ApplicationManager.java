package ru.sftqa.pft.helmesframework.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.sftqa.pft.helmesframework.model.RequiredCaseData;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  ChromeDriver wd;

  public static boolean isAlertPresent(FirefoxDriver wd) {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  public void init() {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("https://www-i1ref.audatex.net/breclient/ui");
    login("M_BREI_02SendMessageWithAttachments", "demo");
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

  public void submitClaimCreation() throws InterruptedException {
    wd.findElement(By.id("submitButton")).click();
   // Thread.sleep(500);

  }

  public void fillinRequiredFields(RequiredCaseData requiredCaseData) {
    wd.findElement(By.id("root.task.claimNumber")).click();
    wd.findElement(By.id("root.task.claimNumber")).clear();
    wd.findElement(By.id("root.task.claimNumber")).sendKeys(requiredCaseData.getCaseNumber());
    wd.findElement(By.id("root.task.basicClaimData.vehicle.vehicleAdmin.plateNumber")).click();
    wd.findElement(By.id("root.task.basicClaimData.vehicle.vehicleAdmin.plateNumber")).clear();
    wd.findElement(By.id("root.task.basicClaimData.vehicle.vehicleAdmin.plateNumber")).sendKeys(requiredCaseData.getLicensePlateNumber());
    //L2M8
  }

  public void initClaimCreation() {
    wd.findElement(By.id("newCaseBtn")).click();
  }

  public void stop() {
    wd.quit();
  }

  public void clickClaimManagerIcon() {
      wd.findElement(By.id("navigation-action-li-home")).click();
  }

  public void submitDeletion() {
      wd.findElement(By.xpath("//div[@id='DeleteTaskPopup']//button[@class='btn-solera btn-solera-default btn-modal']")).click();
  }

  public void fillInCommentForDeletion() {
      wd.findElement(By.id("root.task.workflow.deleteTask.dialog-comment")).click();
      wd.findElement(By.id("root.task.workflow.deleteTask.dialog-comment")).clear();
      wd.findElement(By.id("root.task.workflow.deleteTask.dialog-comment")).sendKeys("lpv");
  }

  public void deleteTaskFromMoreMenu() {
      wd.findElement(By.linkText("Delete the task")).click();
  }

  public void openMoreMenu() {
      wd.findElement(By.xpath("//div[@class=' z-last z-cell']")).click();
  }

  public void selectFirstClaimFromWorkListGrid() {
      wd.findElement(By.id("more-row-icon-0")).click();
  }
}
