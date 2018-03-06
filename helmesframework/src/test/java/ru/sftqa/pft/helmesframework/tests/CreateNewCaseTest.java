package ru.sftqa.pft.helmesframework.tests;

import org.testng.annotations.Test;
import ru.sftqa.pft.helmesframework.model.ClaimDescriptionData;
import ru.sftqa.pft.helmesframework.model.NewCaseData;


public class CreateNewCaseTest extends TestBase {

  @Test
  public void testClaimCreation() throws InterruptedException {

    app.getNewCaseHelper().initClaimCreation();
    app.getNewCaseHelper().fillinRequiredFields(new NewCaseData("LPV CN 01022018-4", "LPVLP 02022018-4"));
    app.getNewCaseHelper().submitClaimCreation();
    /*
    app.getNavigationHelper().clickNextButtonOnClaim();
    app.getNewCaseHelper().fillInClaimDescriptionData(new ClaimDescriptionData("LPVPolicyCompany", "LPVInspectionCompany", "LPVRepairerCompany"));
    app.getNavigationHelper().clickNextButtonOnClaim();
    */
    app.getNavigationHelper().clickClaimManagerIcon();
  }

}
