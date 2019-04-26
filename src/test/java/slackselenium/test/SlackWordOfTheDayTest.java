package slackselenium.test;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import slackselenium.Constants;
import slackselenium.pages.ChannelPage;
import slackselenium.pages.LoginPage;

public class SlackWordOfTheDayTest extends BaseTest {

    /*
     * TODO
     */
    @Test
    public void sendMessage() throws InterruptedException {
        driver.get(Constants.SLACK_CHANNEL_URL);

        // 1. Login
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterEmail("test@yahoo.co.uk");
        loginPage.enterPassword("1");

        ChannelPage channelPage = loginPage.clickLoginButton();

        Thread.sleep(2000L);

        // 2. Click on channel you want
        channelPage.clickChannel();

        // 3. Send messages
        channelPage.sendMessage(".");

    }
}