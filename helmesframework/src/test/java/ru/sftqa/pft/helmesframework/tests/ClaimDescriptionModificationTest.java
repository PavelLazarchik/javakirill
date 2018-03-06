package ru.sftqa.pft.helmesframework.tests;

import org.testng.annotations.Test;
import ru.sftqa.pft.helmesframework.model.ClaimDescriptionData;
import ru.sftqa.pft.helmesframework.model.UpdatedClaimDescriptionData;

//реализовать один класс для созадния Claim Description Page и для редактирования Claim Description Page
public class ClaimDescriptionModificationTest extends TestBase {

    @Test
    public void testModifyClaimDescription() throws InterruptedException {

        app.getNewCaseHelper().openClaimDetails();
        app.getNavigationHelper().clickNextButtonOnClaim();
        app.getNewCaseHelper().fillInUpdatedDataToClaimDescription(new ClaimDescriptionData("LPV02032018-Updated", "12345", "Policy Updated", "InspectionUpdated", "RepairerUpdated" ));
        app.getNavigationHelper().clickNextButtonOnClaim();
    }

}