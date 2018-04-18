package ru.sftqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.sftqa.pft.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {

    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().createGroup(new GroupData("LPV Test 2", null, null));
    app.getNavigationHelper().gotoGroupPage();
    int after = app.getGroupHelper().getGroupCount();
    //Сравниваем колличество элементов "selected[] ДО и ПОСЛЕ создания контакта
    Assert.assertEquals(after, before + 1);
  }

}


