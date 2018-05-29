package ru.sftqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.sftqa.pft.addressbook.model.GroupData;

import java.util.List;


public class GroupCreationTests extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {

    app.getNavigationHelper().gotoGroupPage();

    // после реализации этого метода before будет содержать не количество элементов, а СПИСОК элементов
    List<GroupData> before = app.getGroupHelper().getGroupList();
    //int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().createGroup(new GroupData("LPV Test 2", null, null));
    app.getNavigationHelper().gotoGroupPage();

    List<GroupData> after = app.getGroupHelper().getGroupList();
  // размер списка ПОСЛЕ создания группы равен размеру списка ДО СОЗДАНИЯ группы + 1
    Assert.assertEquals(after.size(), before.size() + 1);

  //  int after = app.getGroupHelper().getGroupCount();
    //Сравниваем колличество элементов "selected[] ДО и ПОСЛЕ создания контакта
   // Assert.assertEquals(after, before + 1);
  }

}


