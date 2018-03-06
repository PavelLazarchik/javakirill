package ru.sftqa.pft.helmesframework.tests;

import org.testng.annotations.Test;
import ru.sftqa.pft.helmesframework.model.ClaimDescriptionData;

public class ClaimDescriptionCreationTest extends TestBase{

  @Test

  public void createClaimDescrption() throws InterruptedException{
    app.getNewCaseHelper().openClaimDetails();
   // app.getNavigationHelper().openClaimDescriptionPageFromMenu();
    app.getNavigationHelper().clickNextButtonOnClaim();
    Thread.sleep(3000);
    app.getNewCaseHelper().fillInClaimDescriptionData(new ClaimDescriptionData("Case Number ", "12345", "LPV PolicyCompany","LPV InspectionCompany", "LPV Repairer Company"));
    app.getNavigationHelper().clickNextButtonOnClaim();

  }
}
