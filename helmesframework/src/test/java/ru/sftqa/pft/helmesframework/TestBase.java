package ru.sftqa.pft.helmesframework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
  ChromeDriver wd;

  public static boolean isAlertPresent(FirefoxDriver wd) {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  @BeforeMethod
  public void setUp() throws Exception {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("https://www-i1ref.audatex.net/breclient/ui");
    login("M_BREI_02SendMessageWithAttachments", "demo");
  }

  private void login(String username, String password) {
    wd.findElement(By.id("ssousername")).click();
    wd.findElement(By.id("ssousername")).clear();
    wd.findElement(By.id("ssousername")).sendKeys(username);
    wd.findElement(By.id("password")).click();
    wd.findElement(By.id("password")).clear();
    wd.findElement(By.id("password")).sendKeys(password);
    wd.findElement(By.name("submit")).click();
  }

  protected void submitClaimCreation() throws InterruptedException {
    wd.findElement(By.id("submitButton")).click();
   // Thread.sleep(500);

  }

  protected void fillinRequiredFields(RequiredCaseData requiredCaseData) {
    wd.findElement(By.id("root.task.claimNumber")).click();
    wd.findElement(By.id("root.task.claimNumber")).clear();
    wd.findElement(By.id("root.task.claimNumber")).sendKeys(requiredCaseData.getCaseNumber());
    wd.findElement(By.id("root.task.basicClaimData.vehicle.vehicleAdmin.plateNumber")).click();
    wd.findElement(By.id("root.task.basicClaimData.vehicle.vehicleAdmin.plateNumber")).clear();
    wd.findElement(By.id("root.task.basicClaimData.vehicle.vehicleAdmin.plateNumber")).sendKeys(requiredCaseData.getLicensePlateNumber());
    //L2M8
  }

  protected void initClaimCreation() {
    wd.findElement(By.id("newCaseBtn")).click();
  }

  @AfterMethod
  public void tearDown() {
    wd.quit();
  }

  protected void clickClaimManagerIcon() {
      wd.findElement(By.id("navigation-action-li-home")).click();
  }

  protected void submitDeletion() {
      wd.findElement(By.xpath("//div[@id='DeleteTaskPopup']//button[@class='btn-solera btn-solera-default btn-modal']")).click();
  }

  protected void fillInCommentForDeletion() {
      wd.findElement(By.id("root.task.workflow.deleteTask.dialog-comment")).click();
      wd.findElement(By.id("root.task.workflow.deleteTask.dialog-comment")).clear();
      wd.findElement(By.id("root.task.workflow.deleteTask.dialog-comment")).sendKeys("lpv");
  }

  protected void deleteTaskFromMoreMenu() {
      wd.findElement(By.linkText("Delete the task")).click();
  }

  protected void openMoreMenu() {
      wd.findElement(By.xpath("//div[@class=' z-last z-cell']")).click();
  }
}
