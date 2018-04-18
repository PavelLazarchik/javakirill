import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class aaa {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void aaa() {
        wd.get("https://www-i1ref.audatex.net/sso/login?service=https%3a%2f%2fwww-i1ref.audatex.net%2fbreclient%2fui%3ftaskId%3d47D10F77-DFC8-86BB-29F0-9F11D6B63F5C%26process%3dKASKO%26step%3dCase");
        wd.findElement(By.id("ssousername")).click();
        wd.findElement(By.id("ssousername")).clear();
        wd.findElement(By.id("ssousername")).sendKeys("lpv_repairer");
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("demo");
        wd.findElement(By.name("submit")).click();
        wd.findElement(By.linkText("Claim description")).click();
        wd.findElement(By.cssSelector("div.Select-value")).click();
        wd.findElement(By.cssSelector("div.Select-value")).click();
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
