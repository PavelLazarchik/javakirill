package ru.sftqa.pft.helmesframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ClaimCreationTests {
  ChromeDriver wd;

  @BeforeMethod
  public void setUp() throws Exception {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("https://www-i1ref.audatex.net/breclient/ui");
    login("mapfre_u3", "mapfre");
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

  @Test
  public void testClaimCreation() {

    initClaimCreation();
    fillinRequiredFields(new RequiredCaseData("LPV CN 01022018-4", "LPVLP 02022018-4"));
    submitClaimCreation();
    // wd.findElement(By.id("toDoListItem_Claim_description")).click();
    // wd.findElement(By.xpath("//div[@class='collapsed-menu']//button[.='Toggle navigation']")).click();
    //  wd.findElement(By.id("icon-home")).click();
  }

  private void submitClaimCreation() {
    wd.findElement(By.id("submitButton")).click();
  }

  private void fillinRequiredFields(RequiredCaseData requiredCaseData) {
    wd.findElement(By.id("root.task.claimNumber")).click();
    wd.findElement(By.id("root.task.claimNumber")).clear();
    wd.findElement(By.id("root.task.claimNumber")).sendKeys(requiredCaseData.getCaseNumber());
    wd.findElement(By.id("root.task.basicClaimData.vehicle.vehicleAdmin.plateNumber")).click();
    wd.findElement(By.id("root.task.basicClaimData.vehicle.vehicleAdmin.plateNumber")).clear();
    wd.findElement(By.id("root.task.basicClaimData.vehicle.vehicleAdmin.plateNumber")).sendKeys(requiredCaseData.getLicensePlateNumber());
  }

  private void initClaimCreation() {
    wd.findElement(By.id("newCaseBtn")).click();
  }

  @AfterMethod
  public void tearDown() {
    wd.quit();
  }

  public static boolean isAlertPresent(FirefoxDriver wd) {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
}
