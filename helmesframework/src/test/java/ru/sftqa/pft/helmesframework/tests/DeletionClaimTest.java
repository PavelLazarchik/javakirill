package ru.sftqa.pft.helmesframework.tests;

import org.testng.annotations.Test;

public class DeletionClaimTest extends TestBase{

    @Test
    public void testClaimDeletion() throws InterruptedException {
        app.getNavigationHelper().openMoreMenu();
        app.getNewCaseHelper().selectFirstClaimFromWorkListGrid();
        app.getNavigationHelper().deleteTaskFromMoreMenu();
        Thread.sleep(3000);
        app.getNewCaseHelper().fillInCommentForDeletion();
        app.getNewCaseHelper().submitDeletion();
        app.getNavigationHelper().clickClaimManagerIcon();
    }

}

