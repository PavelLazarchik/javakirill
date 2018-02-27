package ru.sftqa.pft.helmesframework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class ClaimCreationTests extends TestBase {

  @Test
  public void testClaimCreation() throws InterruptedException {

    initClaimCreation();
    fillinRequiredFields(new RequiredCaseData("LPV CN 01022018-4", "LPVLP 02022018-4"));
    submitClaimCreation();
    clickClaimManagerIcon();
  }

}
