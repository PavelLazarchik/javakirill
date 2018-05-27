package ru.sftqa.pft.helmesframework.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import ru.sftqa.pft.helmesframework.model.ClaimDescriptionData;
import ru.sftqa.pft.helmesframework.model.NewCaseData;
import ru.sftqa.pft.helmesframework.model.UpdatedClaimDescriptionData;

public class NewCaseHelper extends HelperBase {

  public NewCaseHelper(ChromeDriver wd) {
    super(wd);
  }

  public void submitClaimCreation()  {
    click(By.id("submitButton"));
   // Thread.sleep(500);

  }

  public void fillinRequiredFields(NewCaseData requiredCaseData) {
    type(By.id("root.task.claimNumber"), requiredCaseData.getCaseNumber());
    type(By.id("root.task.basicClaimData.vehicle.vehicleAdmin.plateNumber"), requiredCaseData.getLicensePlateNumber());
    type(By.id("root.task.basicClaimData.vehicle.vehicleIdentification.VIN"), requiredCaseData.getVIN());
    //L2M8
  }

  public void initClaimCreation() {
    click(By.id("newCaseBtn"));
  }

  public void submitDeletion() {
   // click(By.className("btn-solera btn-solera-default btn-modal"));
    click(By.xpath("//div[@id='DeleteTaskPopup']//button[@class='btn-solera btn-solera-default btn-modal']"));
  }


  public void fillInCommentForDeletion() {
    type(By.id("root.task.workflow.deleteTask.dialog-comment"), "lpv");
  }


  public void selectFirstClaimFromWorkListGrid() {
    click(By.id("more-row-icon-0"));
  }


  public void fillInClaimDescriptionData(ClaimDescriptionData claimDescriptionData) {
    type(By.id("root.task.claimNumber"), claimDescriptionData.getCaseNumber());
    type(By.id("root.task.displayName"),claimDescriptionData.getReferenceNumber());
    click(By.id("react-select-root.task.caseType--value-item"));
    // wd.findElement(By.xpath("//div[@aria-activedescendant = 'react-select-root.task.caseType--option-3']")).click();
    type(By.id("root.task.basicClaimData.policyData.policyHolder.companyName"), claimDescriptionData.getPolicyCompanyName());
   // type(By.id("root.task.basicClaimData.vehicle.vehicleAdmin.vehicleOwner.companyName"), claimDescriptionData.getInspectionCompanyName());
    type(By.id("root.task.basicClaimData.repairDetail.bodyshop.companyName"), claimDescriptionData.getRepairerCompanyName());
    //new Select(wd.findElement(By.name("root.task.caseType"))).selectByVisibleText(claimDescriptionData.getCaseType());

  }

  public void openClaimDetails() {
    new Actions(wd).doubleClick(wd.findElement(By.xpath("//div[@class='z-table']/div[1]/div[4]/div"))).build().perform();
  }

 /* public void fillInUpdatedDataToClaimDescription(UpdatedClaimDescriptionData updatedClaimDescriptionData){
    type(By.id("root.task.claimNumber"), updatedClaimDescriptionData.getCaseNumber());
    type(By.id("root.task.basicClaimData.policyData.policyHolder.companyName"), updatedClaimDescriptionData.getPolicyCompanyName());
  }*/

   public void fillInUpdatedDataToClaimDescription(ClaimDescriptionData claimDescriptionData) throws InterruptedException {
    type(By.id("root.task.claimNumber"), claimDescriptionData.getCaseNumber());
    type(By.id("root.task.displayName"),claimDescriptionData.getReferenceNumber());
    //  new Select(wd.findElement(By.xpath("//*[@class='Select root.task.caseType has-value Select--single']"))).selectByValue(claimDescriptionData.getCaseType());
     click(By.id("react-select-root.task.caseType--value-item"));
     wd.findElement(By.xpath("//div[@aria-activedescendant = 'react-select-root.task.caseType--option-3']")).click();



    type(By.id("root.task.basicClaimData.policyData.policyHolder.companyName"), claimDescriptionData.getPolicyCompanyName());
    type(By.id("root.task.basicClaimData.repairDetail.bodyshop.companyName"), claimDescriptionData.getRepairerCompanyName());

//     selectListItem(By.xpath("react-select-root.task.caseType--value-item"), claimDescriptionData.getCaseType());


   //!!!!!!!!!!!!!!!!!!!! wd.findElement(By.linkText(claimDescriptionData.getCaseType())).click();
      //wd.findElement(By.name("root.task.caseType")).click();
     //     click(By.name("root.task.caseType"));
     //wd.findElement(By.linkText("Other")).click();

  // new Select(wd.findElement(By.xpath("//*[@class='Select root.task.caseType has-value Select--single']"))).selectByValue(claimDescriptionData.getCaseType());
   }

  /* public void selectValueFromDropDown(){
     wd.findElement(By.name("root.task.caseType")).click();

   }
*/
   public boolean isThereClaim () {
     return isElementPresent(By.name("select"));
   }

  public void createAClaim(NewCaseData requiredCaseData) {
    initClaimCreation();
    fillinRequiredFields(requiredCaseData);
    submitClaimCreation();
  }


}
