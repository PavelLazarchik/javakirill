package ru.sftqa.pft.helmesframework.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationHelper extends HelperBase{

  public NavigationHelper(ChromeDriver wd) {
    super(wd);
  }

  public void clickClaimManagerIcon() {
    click(By.id("navigation-action-li-home"));
      }

  public void deleteTaskFromMoreMenu() {
    click(By.linkText("Delete the task"));
    }

  public void openMoreMenu() {
    click(By.xpath("//div[@class=' z-last z-cell']"));
      }

   public void clickNextButtonOnClaim() {
    click(By.id("nextButton"));
   }

   public void openMessageListGrid () {
     click(By.id("navigation-action-li-messagelist"));
   }

   public void openClaimDescriptionPageFromMenu() {
    click(By.id("toDoListItem_Claim_description"));
   }
}
