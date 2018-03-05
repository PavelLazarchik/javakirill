package ru.sftqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.sftqa.pft.addressbook.appmanager.HelperBase;
import ru.sftqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

  @Test
  public void testContactModification() {
    app.getNavigationHelper().goToContactPage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().CreateAContact(new ContactData("LpvFn3", "LpvMN2", "LpvLN1", "LpvNN1", "LpvT1", "LpvCny1", "LpvAddrs1", "255", "750", "aaa@aaa.vv", "LPV Test 2"));
    }
    app.getNavigationHelper().goToContactPage();
    app.getContactHelper().selectContact();
    app.getContactHelper().clickEditIcon();
    app.getContactHelper().fillContactForm(new ContactData("LpvFn4", "LpvMN2", "LpvLN2", "LpvNN2", "LpvT2", "LpvCny2", "LpvAddrs2", "255", "750", "aaa@aaa.vv", null));
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().goToContactPage();

  }
}
