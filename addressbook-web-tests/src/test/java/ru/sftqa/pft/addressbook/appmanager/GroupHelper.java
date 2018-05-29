package ru.sftqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.sftqa.pft.addressbook.model.GroupData;

import java.util.ArrayList;
import java.util.List;

public class GroupHelper extends HelperBase{

  public GroupHelper(WebDriver wd) {
    super(wd);
  }
  public void returnToGroupPage() {
    click(By.linkText("group page"));
  }
  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }

  public void initGroupCreation() {
    click(By.name("new"));
  }



  public void deleteSelectedGroups() {
    click(By.name("delete"));
  }

  //ввели переменную индекс. По группе с определяемым номером индекса производится клик - то есть выбирается группа
  public void selectGroup(int index) {
    wd.findElements(By.name("selected[]")).get(index).click();
  }

  public void initGroupModification() {
    click(By.name("edit"));
  }

  public void submitGroupModification() {
    click(By.name("update"));
  }

  public void createGroup(GroupData group) {
    initGroupCreation();
    fillGroupForm(group);
    submitGroupCreation();
  }

  public boolean isThereAGroup() {
    return isElementPresent(By.name("selected[]"));
  }

  //method which allows to get the count of groups. Будет считать количество элементов "selected[]"  на странице
  public int getGroupCount() {
  return wd.findElements(By.name("selected[]")).size();
  }

  public List<GroupData> getGroupList() {
    //создаем список , который будем заполнять
    List<GroupData> groups = new ArrayList<GroupData>();
    // Надо заполнить лист объектами. Данные для создания объектов будут извлекаться со страницы веб приложения
    List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
    for (WebElement element : elements){
      String name = element.getText();
      GroupData group = new GroupData (name, null, null);
      //добавляем созданный объект в список
      groups.add(group);
    }
    return groups;
  }
}
