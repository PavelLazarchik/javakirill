package ru.sftqa.pft.helmesframework.tests;

import org.testng.annotations.Test;

public class DeletionClaimTest extends TestBase{

    @Test
    public void testClaimDeletion() throws InterruptedException {
        app.openMoreMenu();
        app.selectFirstClaimFromWorkListGrid();
        app.deleteTaskFromMoreMenu();
        Thread.sleep(3000);
        app.fillInCommentForDeletion();
        app.submitDeletion();
        app.clickClaimManagerIcon();
    }

}

