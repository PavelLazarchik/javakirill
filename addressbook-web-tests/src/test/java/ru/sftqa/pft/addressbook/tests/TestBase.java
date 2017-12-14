package ru.sftqa.pft.addressbook.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.sftqa.pft.addressbook.appmanager.ApplicationManager;


//роль TestBase: перед каждым тестовым методом инициализирует объект типа ApplicationManager
//А после того как метод отработал, останавливает его
public class TestBase {

  protected final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }


  @AfterMethod
  public void tearDown() {
    app.stop();
  }

}
