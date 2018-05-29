package ru.sftqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.sftqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupModificationTests extends TestBase {
  @Test
  //create the test for group modification
  public void testGroupModification(){
    app.getNavigationHelper().gotoGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test 1", null, null));
    }
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();

    //считаем количество групп перед изменением группы
    //int before = app.getGroupHelper().getGroupCount();
    //выбираем для изменения первую группу
    app.getGroupHelper().selectGroup(0);
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("LPV Test 3", "LPV Test 3 Header", "LPV Test 3 Footer"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();

    List<GroupData> after = app.getGroupHelper().getGroupList();
    //считаем количество групп после изменения группы
    //int after = app.getGroupHelper().getGroupCount();
    //сравниваем размер списка До и ПОСЛЕ. Не должно быть отличия в количестве
    Assert.assertEquals(after.size(), before.size());
  }

}
