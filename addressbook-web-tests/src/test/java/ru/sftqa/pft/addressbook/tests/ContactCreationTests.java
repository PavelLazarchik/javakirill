package ru.sftqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.sftqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testGroupCreation()  {

    //app.getNavigationHelper().gotoGroupPage();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("LpvFn1", "LpvMN1", "LpvLN1", "LpvNN1", "LpvT1", "LpvCny1", "LpvAddrs1", "255", "750", "aaa@aaa.vv"));
    app.getContactHelper().submitContactCreation();
  }
}
