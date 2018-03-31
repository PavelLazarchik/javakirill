package ru.sftqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.sftqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testGroupCreation()  {
    app.getContactHelper().CreateAContact(new ContactData("LpvFn1", "LpvMN1", "LpvLN1", "LpvNN1", "LpvT1", "LpvCny1", "LpvAddrs1", "255", "750", "aaa@aaa.vv", "LPV Test 2"));
  }
}
