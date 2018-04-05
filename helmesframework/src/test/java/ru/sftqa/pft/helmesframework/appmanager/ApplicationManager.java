package ru.sftqa.pft.helmesframework.appmanager;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {

  ChromeDriver wd;

  private  NavigationHelper navigationHelper;
  private NewCaseHelper newCaseHelper;
  private SessionHelper sessionHelper;
  private  MessageHelper messageHelper;



  public void init() {
   wd = new ChromeDriver();
   wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
   wd.get("https://www-i1ref.audatex.net/breclient/ui");
    newCaseHelper = new NewCaseHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    messageHelper = new MessageHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.login("lpv_repairer", "demo");
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

  public MessageHelper getMessageHelper() {
    return messageHelper;
  }
}
