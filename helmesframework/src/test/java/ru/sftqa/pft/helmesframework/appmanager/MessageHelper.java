package ru.sftqa.pft.helmesframework.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.sftqa.pft.helmesframework.model.MessageData;

public class MessageHelper extends HelperBase {

  public MessageHelper (ChromeDriver wd) {
    super(wd);
  }

  public void initMessageCreation (){
    click(By.id("newCaseBtn"));
  }

  public void initAdvancedMemberSearch () {
    click(By.id("root.wfGrid.messageList.new.memberSearch-advancedSearchButton"));
  }

  public void fillInMessageSubjectAndBody(MessageData messageData){
    type(By.id("root.wfGrid.messageList.new.subject"), messageData.getMessageSubject());
    type(By.cssSelector("textarea.new-message-input"), messageData.getMessageBody());
  }

  public void submitAdvancedSearch(){
    click(By.xpath("//div[@id='NewMessageComponentModal']//button[.='Search']"));
  }

  public void selectReceiverFromAdvancedSearchGrid() {
    click(By.xpath("//div[@class='table-field-component']/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[1]/div[1]/div/span/span"));
  }

  public void fillInAdvancedSearchFields(){
  type(By.id("root.wfGrid.messageList.new.memberSearch-advancedSearchWindow-name_or_loginId"), "lpv");
  }

  public void clickSendMessageButton(){
    click(By.id("send"));
  }


}
