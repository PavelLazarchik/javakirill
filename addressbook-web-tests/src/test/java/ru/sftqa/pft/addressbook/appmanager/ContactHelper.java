package ru.sftqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.sftqa.pft.addressbook.model.ContactData;
import ru.sftqa.pft.addressbook.model.GroupData;

public class ContactHelper extends HelperBase{

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  //created the method to click on the link Add New for contact creation
  public void initContactCreation() {
    click(By.linkText("add new"));
    //wd.findElement(By.linkText("add new")).click();
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getfirstName());
    type(By.name("middlename"), contactData.getMiddleName());
    type(By.name("lastname"), contactData.getLastName());
    type(By.name("nickname"), contactData.getNickName());
    type(By.name("title"), contactData.getTitle());
    type(By.name("company"), contactData.getCompany());
    type(By.name("address"), contactData.getAddress());
    type(By.name("home"), contactData.getHomePhone());
    type(By.name("mobile"), contactData.getMobilePhone());
    type(By.name("email"), contactData.getEmail());
  }



    //если процесс создания контакта, элемент 'Groups' ДОЛЖНГ БЫТЬ на странице. И если он есть - то все ок, если нет - exeption
   /* //если процесс создания контакта, элемент группа ДОЛЖНГ БЫТЬ на странице. И если он есть - то все ок, если нет - exeption
    if(creation){
      //как выбрать элемент из drop down
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    }
    // если процесс изменения контакта - элемент 'Groups' НЕ ДОЛЖЕН БЫТЬ
    else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }
  */

  public void submitContactCreation() {
    click(By.name("submit"));
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void submitContactModification(){
    click(By.name("update"));
  }
   public void clickEditIcon() {
    click(By.xpath("//img[@alt='Edit']"));
   }

   public void clickDeleteButton() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
   }

   public void acceptAlertpopup() {
     wd.switchTo().alert().accept();
   }

   /*
  public void createContact(ContactData contact,boolean creation) {
   initContactCreation();
   fillContactForm(contact, true);
   submitContactCreation();}
*/

  public void CreateAContact(ContactData contact) {
    initContactCreation();
    fillContactForm(contact);
    submitContactCreation();
  }

  public boolean isThereAContact() {
    return isElementPresent(By.name("selected[]"));
  }
}
