package ru.sftqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.sftqa.pft.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {
  @Test
  //create the test for group modification
  public void testGroupModification(){
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("LPV Test 3", "LPV Test 3 Header", "LPV Test 3 Footer"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
  }

}
