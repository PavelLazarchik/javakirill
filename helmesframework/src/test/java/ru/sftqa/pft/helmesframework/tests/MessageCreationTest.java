package ru.sftqa.pft.helmesframework.tests;


import org.testng.annotations.Test;
import ru.sftqa.pft.helmesframework.model.MessageData;

public class MessageCreationTest extends TestBase {
    
    @Test
    public void MessageCreationTest() throws InterruptedException {

        Thread.sleep(3000);
        app.getNavigationHelper().openMessageListGrid();
        Thread.sleep(3000);
        app.getMessageHelper().initMessageCreation();
        app.getMessageHelper().initAdvancedMemberSearch();
        Thread.sleep(3000);
        app.getMessageHelper().fillInAdvancedSearchFields();
        app.getMessageHelper().submitAdvancedSearch();
        app.getMessageHelper().selectReceiverFromAdvancedSearchGrid();
        app.getMessageHelper().fillInMessageSubjectAndBody(new MessageData("lpvSubject", "lpvBody"));
        app.getMessageHelper().clickSendMessageButton();
    }
}
