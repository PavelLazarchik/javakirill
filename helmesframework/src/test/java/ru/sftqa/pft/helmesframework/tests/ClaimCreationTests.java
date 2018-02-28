package ru.sftqa.pft.helmesframework.tests;

import org.testng.annotations.Test;
import ru.sftqa.pft.helmesframework.model.RequiredCaseData;


public class ClaimCreationTests extends TestBase {

  @Test
  public void testClaimCreation() throws InterruptedException {

    app.initClaimCreation();
    app.fillinRequiredFields(new RequiredCaseData("LPV CN 01022018-4", "LPVLP 02022018-4"));
    app.submitClaimCreation();
    app.clickClaimManagerIcon();
  }

}