package ru.sftqa.pft.helmesframework.tests;

import org.testng.annotations.Test;
import ru.sftqa.pft.helmesframework.model.UpdatedClaimDescriptionData;

//реализовать один класс для созадния Claim Description Page и для редактирования Claim Description Page
public class ClaimModificationTest extends TestBase {

    @Test
    public void testModufyClaim() throws InterruptedException {

        app.getNewCaseHelper().openClaimDetails();
        app.getNavigationHelper().clickNextButtonOnClaim();
        app.getNewCaseHelper().fillInUpdatedDataToClaimDescription(new UpdatedClaimDescriptionData("LPV02032018-LPV", "LPV PolicyUpdated"));
        app.getNavigationHelper().clickNextButtonOnClaim();
    }

}