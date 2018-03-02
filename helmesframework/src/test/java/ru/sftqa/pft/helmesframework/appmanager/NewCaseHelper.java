package ru.sftqa.pft.helmesframework.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import ru.sftqa.pft.helmesframework.model.ClaimDescriptionData;
import ru.sftqa.pft.helmesframework.model.RequiredCaseData;
import ru.sftqa.pft.helmesframework.model.UpdatedClaimDescriptionData;

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


  public void fillInClaimDescriptionData(ClaimDescriptionData claimDescriptionData) {
   type(By.id("root.task.basicClaimData.policyData.policyHolder.companyName"), claimDescriptionData.getPolicyCompanyName());
   type(By.id("root.task.basicClaimData.vehicle.vehicleAdmin.vehicleOwner.companyName"), claimDescriptionData.getInspectionCompanyName());
   type(By.id("root.task.basicClaimData.repairDetail.bodyshop.companyName"), claimDescriptionData.getRepairerCompanyName());
  }

  public void openClaimDetails() {
    new Actions(wd).doubleClick(wd.findElement(By.xpath("//div[@class='z-table']/div[1]/div[4]/div"))).build().perform();
  }

  public void fillInUpdatedDataToClaimDescription(UpdatedClaimDescriptionData updatedClaimDescriptionData){
    type(By.id("root.task.claimNumber"), updatedClaimDescriptionData.getCaseNumber());
    type(By.id("root.task.basicClaimData.policyData.policyHolder.companyName"), updatedClaimDescriptionData.getPolicyCompanyName());
  }
}
