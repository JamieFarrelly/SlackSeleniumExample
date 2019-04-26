package slackselenium.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChannelPage extends PageObject {
    
    @FindBy(css="#msg_input > .ql-editor")
    private WebElement messageInput;

    @FindBy(css =":nth-child(7) > .c-link > .p-channel_sidebar__name")
    private WebElement channelLink;
    
    public ChannelPage(WebDriver driver) {
        super(driver);
    }
    
    public void sendMessage(String message) {
        this.messageInput.clear();
        this.messageInput.sendKeys(message);
        this.messageInput.sendKeys(Keys.RETURN);
    }

    public void clickChannel() {
        channelLink.click();
    }
}