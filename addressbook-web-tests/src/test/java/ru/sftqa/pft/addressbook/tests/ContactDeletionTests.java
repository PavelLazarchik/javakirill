package ru.sftqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

  @Test
  public void deletionContact(){
    app.getNavigationHelper().goToContactPage();
    app.getContactHelper().selectContact();
    app.getContactHelper().clickDeleteButton();
    app.getContactHelper().acceptAlertpopup();

  }
}
