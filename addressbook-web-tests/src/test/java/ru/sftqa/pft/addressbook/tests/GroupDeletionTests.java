package ru.sftqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.sftqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {

    app.getNavigationHelper().gotoGroupPage();

    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test 1", null, null));
    }

    List<GroupData> before = app.getGroupHelper().getGroupList();
    //считаем количество групп перед удалением группы
    //int before = app.getGroupHelper().getGroupCount();
    app.getNavigationHelper().gotoGroupPage();
    //Добавляем возможность выбора произвольной группы. В данном случае будет выбирать последнюю группу
    app.getGroupHelper().selectGroup(before.size() - 1);
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
    List<GroupData> after = app.getGroupHelper().getGroupList();
    //считаем колчество групп после удаления группы
    //int after = app.getGroupHelper().getGroupCount();
    //сравниваем рвзмер списка  До и ПОСЛЕ. Должно быть отличие в 1 группу
    Assert.assertEquals(after.size(), before.size() - 1);
  }

}
