package ru.sftqa.pft.helmesframework.tests;

import org.testng.annotations.Test;
import ru.sftqa.pft.helmesframework.model.ClaimDescriptionData;
import ru.sftqa.pft.helmesframework.model.NewCaseData;
import ru.sftqa.pft.helmesframework.model.UpdatedClaimDescriptionData;

//реализовать один класс для созадния Claim Description Page и для редактирования Claim Description Page
public class ClaimDescriptionModificationTest extends TestBase {

    @Test
    public void testModifyClaimDescription() throws InterruptedException {

        if (!app.getNewCaseHelper().isThereClaim()) {
            app.getNewCaseHelper().createAClaim(new NewCaseData("UpdatedCN02042018", "UpdatedLP02042018", "TRUZZZ8J991028634 "));
        }
        app.getNewCaseHelper().openClaimDetails();
        app.getNavigationHelper().clickNextButtonOnClaim();
        app.getNewCaseHelper().fillInUpdatedDataToClaimDescription(new ClaimDescriptionData("LPV02032018-Updated2", null, "Policy Updated2", "RepairerUpdated2" ));
        app.getNavigationHelper().clickNextButtonOnClaim();
    }

}