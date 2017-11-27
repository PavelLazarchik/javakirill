package ru.sftqa.pft.addressbook;

import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {

    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("LPV Test 2", "LPV Test 2 Header", "LPV Test 2 Footer"));
    submitGroupCreation();
  }

}


