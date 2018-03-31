package ru.sftqa.pft.helmesframework.model;

public class NewCaseData {
  private final String caseNumber;
  private final String licensePlateNumber;

  public NewCaseData(String caseNumber, String licensePlateNumber) {
    this.caseNumber = caseNumber;
    this.licensePlateNumber = licensePlateNumber;
  }

  public String getCaseNumber() {
    return caseNumber;
  }

  public String getLicensePlateNumber() {
    return licensePlateNumber;
  }
}
