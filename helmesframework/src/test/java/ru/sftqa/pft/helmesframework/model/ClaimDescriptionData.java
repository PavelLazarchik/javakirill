package ru.sftqa.pft.helmesframework.model;

public class ClaimDescriptionData {
  private final String caseNumber;
  private final String referenceNumber;
  private final String policyCompanyName;
//  private final String inspectionCompanyName;
  private final String repairerCompanyName;


  public ClaimDescriptionData(String caseNumber,  String referenceNumber, String policyCompanyName,String repairerCompanyName) {
    this.caseNumber = caseNumber;
    this.referenceNumber = referenceNumber;
    this.policyCompanyName = policyCompanyName;
  //  this.inspectionCompanyName = inspectionCompanyName;
    this.repairerCompanyName = repairerCompanyName;
  }

  public String getCaseNumber() {
    return caseNumber;
  }

  public String getReferenceNumber() {
    return referenceNumber;
  }

  public String getPolicyCompanyName() {
    return policyCompanyName;
  }
 // public String getInspectionCompanyName() {
 //   return inspectionCompanyName;
 // }
  public String getRepairerCompanyName() {
    return repairerCompanyName;
  }

}

