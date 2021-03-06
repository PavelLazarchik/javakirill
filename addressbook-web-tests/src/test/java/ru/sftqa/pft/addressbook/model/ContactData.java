package ru.sftqa.pft.addressbook.model;

public class ContactData {
  private final String firstName;
  private final String middleName;
  private final String lastName;
  private final String nickName;
  private final String title;
  private final String company;
  private final String address;
  private final String homePhone;
  private final String mobilePhone;
  private final String email;
  private final String group;

  public ContactData(String firstName, String middleName, String lastName, String nickName, String title, String company, String address, String homePhone, String mobilePhone, String email, String group) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.nickName = nickName;
    this.title = title;
    this.company = company;
    this.address = address;
    this.homePhone = homePhone;
    this.mobilePhone = mobilePhone;
    this.email = email;
    this.group = group;
  }

  public String getfirstName() {
    return firstName;
  }
  public String getMiddleName() {
    return middleName;
  }
  public String getLastName() {
    return lastName;
  }
  public String getNickName() {
    return nickName;
  }
  public String getTitle(){return  title;}
  public String getCompany(){return company;}
  public String getAddress() {return address;}
  public String getHomePhone() {return homePhone;}
  public String getMobilePhone(){return mobilePhone;}
  public String getEmail() {return email;}
  public String getGroup() {
    return group;
  }
}

