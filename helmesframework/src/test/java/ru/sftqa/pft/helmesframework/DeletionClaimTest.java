package ru.sftqa.pft.helmesframework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DeletionClaimTest extends TestBase{

    @Test
    public void testClaimDeletion() throws InterruptedException {
        openMoreMenu();
        wd.findElement(By.id("more-row-icon-0")).click();
        deleteTaskFromMoreMenu();
        Thread.sleep(3000);
        fillInCommentForDeletion();
        submitDeletion();
        clickClaimManagerIcon();
    }

}

