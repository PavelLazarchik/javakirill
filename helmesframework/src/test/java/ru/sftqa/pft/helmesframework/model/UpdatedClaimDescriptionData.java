package ru.sftqa.pft.helmesframework.model;

public class UpdatedClaimDescriptionData {

  private final String caseNumber;
  private final String policyCompanyName;


  public UpdatedClaimDescriptionData(String caseNumber, String policyCompanyName) {
    this.caseNumber = caseNumber;
    this.policyCompanyName = policyCompanyName;
  }

  public String getCaseNumber() {
    return caseNumber;
  }

  public String getPolicyCompanyName() {
    return policyCompanyName;
  }
}
