package ru.sftqa.pft.helmesframework.tests;

import org.testng.annotations.Test;

public class DeletionClaimTest extends TestBase{

    @Test
    public void testClaimDeletion() throws InterruptedException {
        app.getNavigationHelper().openMoreMenu();
        app.getNewCaseHelper().selectFirstClaimFromWorkListGrid();
        app.getNavigationHelper().deleteTaskFromMainMenu();
        Thread.sleep(3000);
        //commented this step because of deletion scenario is removed
       // app.getNewCaseHelper().fillInCommentForDeletion();
        app.getNewCaseHelper().submitDeletion();
        app.getNavigationHelper().clickClaimManagerIcon();
    }

}

