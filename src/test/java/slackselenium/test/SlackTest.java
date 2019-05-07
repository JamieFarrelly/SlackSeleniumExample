package slackselenium.test;
import org.junit.Test;

import slackselenium.Constants;
import slackselenium.pages.ChannelPage;
import slackselenium.pages.LoginPage;

public class SlackTest extends BaseTest {

    @Test
    public void sendMessage() {
        
        driver.get(Constants.SLACK_CHANNEL_URL);

        // 1. Login
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterEmail("yourEmail@gmail.com");
        loginPage.enterPassword("YourPassword");

        ChannelPage channelPage = loginPage.clickLoginButton();

        // 2. Click on channel you want
        channelPage.clickChannel();

        // 3. Send message
        channelPage.sendMessage("Hello there, this is the message that I want to send");
        
        // 4. TODO: Check that the message was sent to the channel (I intentionally left this out so that you can practice automating flows!)
    }
}
