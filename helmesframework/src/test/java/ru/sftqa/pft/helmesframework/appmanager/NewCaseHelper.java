package ru.sftqa.pft.helmesframework.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.sftqa.pft.helmesframework.model.RequiredCaseData;

public class NewCaseHelper {
  private ChromeDriver wd;

  public NewCaseHelper(ChromeDriver wd) {
    this.wd = wd;
  }

  public void submitClaimCreation() throws InterruptedException {
    wd.findElement(By.id("submitButton")).click();
   // Thread.sleep(500);

  }

  public void fillinRequiredFields(RequiredCaseData requiredCaseData) {
    wd.findElement(By.id("root.task.claimNumber")).click();
    wd.findElement(By.id("root.task.claimNumber")).clear();
    wd.findElement(By.id("root.task.claimNumber")).sendKeys(requiredCaseData.getCaseNumber());
    wd.findElement(By.id("root.task.basicClaimData.vehicle.vehicleAdmin.plateNumber")).click();
    wd.findElement(By.id("root.task.basicClaimData.vehicle.vehicleAdmin.plateNumber")).clear();
    wd.findElement(By.id("root.task.basicClaimData.vehicle.vehicleAdmin.plateNumber")).sendKeys(requiredCaseData.getLicensePlateNumber());
    //L2M8
  }

  public void initClaimCreation() {
    wd.findElement(By.id("newCaseBtn")).click();
  }

  public void submitDeletion() {
      wd.findElement(By.xpath("//div[@id='DeleteTaskPopup']//button[@class='btn-solera btn-solera-default btn-modal']")).click();
  }

  public void fillInCommentForDeletion() {
      wd.findElement(By.id("root.task.workflow.deleteTask.dialog-comment")).click();
      wd.findElement(By.id("root.task.workflow.deleteTask.dialog-comment")).clear();
      wd.findElement(By.id("root.task.workflow.deleteTask.dialog-comment")).sendKeys("lpv");
  }

  public void selectFirstClaimFromWorkListGrid() {
      wd.findElement(By.id("more-row-icon-0")).click();
  }
}
