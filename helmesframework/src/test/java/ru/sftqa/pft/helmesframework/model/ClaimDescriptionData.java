package ru.sftqa.pft.helmesframework.model;

public class ClaimDescriptionData {
  private final String policyCompanyName;
  private final String inspectionCompanyName;
  private final String repairerCompanyName;

  public ClaimDescriptionData(String policyCompanyName, String inspectionCompanyName, String repairerCompanyName) {
    this.policyCompanyName = policyCompanyName;
    this.inspectionCompanyName = inspectionCompanyName;
    this.repairerCompanyName = repairerCompanyName;
  }

  public String getPolicyCompanyName() {
    return policyCompanyName;
  }

  public String getInspectionCompanyName() {
    return inspectionCompanyName;
  }

  public String getRepairerCompanyName() {
    return repairerCompanyName;
  }

}

