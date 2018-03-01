package ru.sftqa.pft.helmesframework.appmanager;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

  ChromeDriver wd;

  private  NavigationHelper navigationHelper;
  private NewCaseHelper newCaseHelper;
  private SessionHelper sessionHelper;



  public void init() {
   wd = new ChromeDriver();
   wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
   wd.get("https://www-i1ref.audatex.net/breclient/ui");
    newCaseHelper = new NewCaseHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.login("M_BREI_02SendMessageWithAttachments", "demo");
  }



  public void stop() {
    wd.quit();
  }

  public NewCaseHelper getNewCaseHelper() {
    return newCaseHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
