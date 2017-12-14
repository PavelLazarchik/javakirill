package ru.sftqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.sftqa.pft.addressbook.appmanager.HelperBase;
import ru.sftqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

  @Test
  public void testContactModification() {
    app.getNavigationHelper().goToContactPage();
    app.getContactHelper().selectContact();
    app.getContactHelper().clickEditIcon();
    app.getContactHelper().fillContactForm(new ContactData("LpvFn2", "LpvMN2", "LpvLN2", "LpvNN2", "LpvT2", "LpvCny2", "LpvAddrs2", "255", "750", "aaa@aaa.vv"));
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().goToContactPage();

  }
}
