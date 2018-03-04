package ru.sftqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.sftqa.pft.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {

    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupData("LPV Test 2", null, null));
  }

}


