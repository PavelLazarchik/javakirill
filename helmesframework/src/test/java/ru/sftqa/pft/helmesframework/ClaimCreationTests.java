package ru.sftqa.pft.helmesframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import  org.openqa.selenium.chrome.ChromeDriver;


public class ClaimCreationTests {
    ChromeDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd  = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void testClaimCreation() {
        wd.get("https://www-i1ref.audatex.net/breclient/ui");
        wd.findElement(By.id("ssousername")).click();
        wd.findElement(By.id("ssousername")).clear();
        wd.findElement(By.id("ssousername")).sendKeys("mapfre_u3");
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("mapfre");
        wd.findElement(By.name("submit")).click();
        wd.findElement(By.id("newCaseBtn")).click();
        wd.findElement(By.id("root.task.claimNumber")).click();
        wd.findElement(By.id("root.task.claimNumber")).clear();
        wd.findElement(By.id("root.task.claimNumber")).sendKeys("LPV CN 01022018-4");
        wd.findElement(By.id("root.task.basicClaimData.vehicle.vehicleAdmin.plateNumber")).click();
        wd.findElement(By.id("root.task.basicClaimData.vehicle.vehicleAdmin.plateNumber")).clear();
        wd.findElement(By.id("root.task.basicClaimData.vehicle.vehicleAdmin.plateNumber")).sendKeys("LPVLP 02022018-4");
        wd.findElement(By.id("submitButton")).click();
        wd.findElement(By.id("toDoListItem_Claim_description")).click();
       // wd.findElement(By.xpath("//div[@class='collapsed-menu']//button[.='Toggle navigation']")).click();
      //  wd.findElement(By.id("icon-home")).click();
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
