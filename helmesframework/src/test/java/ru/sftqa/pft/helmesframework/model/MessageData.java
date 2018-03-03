package ru.sftqa.pft.helmesframework.model;

public class MessageData {

  private final String messageSubject;
  private final String messageBody;

  public MessageData (String messageSubject, String messageBody) {
    this.messageSubject = messageSubject;
    this.messageBody = messageBody;
  }

  public String getMessageSubject() {
    return messageSubject;
  }

  public String getMessageBody(){
    return messageBody;
  }


}
