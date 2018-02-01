package ru.stqa.pft.helmesframework;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ClaimCreationTests {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void ClaimCreationTests() {
        wd.get("https://www-i1ref.audatex.net/sso/login?service=https%3a%2f%2fwww-i1ref.audatex.net%2fbreclient%2fui");
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
        wd.findElement(By.id("icon-home")).click();
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
