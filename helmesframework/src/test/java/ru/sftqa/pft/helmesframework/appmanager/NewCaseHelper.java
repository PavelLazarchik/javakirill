package ru.sftqa.pft.helmesframework.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.sftqa.pft.helmesframework.model.RequiredCaseData;

public class NewCaseHelper extends HelperBase {

  public NewCaseHelper(ChromeDriver wd) {
    super(wd);
  }

  public void submitClaimCreation() throws InterruptedException {
    click(By.id("submitButton"));
   // Thread.sleep(500);

  }

  public void fillinRequiredFields(RequiredCaseData requiredCaseData) {
    type(By.id("root.task.claimNumber"), requiredCaseData.getCaseNumber());
    type(By.id("root.task.basicClaimData.vehicle.vehicleAdmin.plateNumber"), requiredCaseData.getLicensePlateNumber());
    //L2M8
  }

  public void initClaimCreation() {
    click(By.id("newCaseBtn"));
  }

  public void submitDeletion() {
    click(By.xpath("//div[@id='DeleteTaskPopup']//button[@class='btn-solera btn-solera-default btn-modal']"));
  }

  public void fillInCommentForDeletion() {
    type(By.id("root.task.workflow.deleteTask.dialog-comment"), "lpv");
  }

  public void selectFirstClaimFromWorkListGrid() {
    click(By.id("more-row-icon-0"));
  }
}
