package ru.sftqa.pft.helmesframework.model;

public class RequiredCaseData {
  private final String caseNumber;
  private final String licensePlateNumber;

  public RequiredCaseData(String caseNumber, String licensePlateNumber) {
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
