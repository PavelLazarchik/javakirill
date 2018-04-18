package ru.sftqa.pft.helmesframework.model;

public class ClaimDescriptionData {
  private final String caseNumber;
  private final String referenceNumber;
  private final String caseType;
  private final String policyCompanyName;
  private final String repairerCompanyName;



  public ClaimDescriptionData(String caseNumber,  String referenceNumber, String caseType, String policyCompanyName,String repairerCompanyName ) {
    this.caseNumber = caseNumber;
    this.referenceNumber = referenceNumber;
    this.caseType = caseType;
    this.policyCompanyName = policyCompanyName;
    this.repairerCompanyName = repairerCompanyName;

  }

  public String getCaseNumber() {
    return caseNumber;
  }

  public String getReferenceNumber() {
    return referenceNumber;
  }

  public String getCaseType() {
    return caseType;
  }

  public String getPolicyCompanyName() {
    return policyCompanyName;
  }

  public String getRepairerCompanyName() {
    return repairerCompanyName;
  }


}

