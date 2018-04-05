package ru.sftqa.pft.helmesframework.model;

public class NewCaseData {
  private final String caseNumber;
  private final String licensePlateNumber;
  private final String VIN;

  public NewCaseData(String caseNumber, String licensePlateNumber, String VIN) {
    this.caseNumber = caseNumber;
    this.licensePlateNumber = licensePlateNumber;
    this.VIN = VIN;
  }

  public String getCaseNumber() {
    return caseNumber;
  }

  public String getLicensePlateNumber() {
    return licensePlateNumber;
  }

  public String getVIN() {
    return VIN;
  }
}
