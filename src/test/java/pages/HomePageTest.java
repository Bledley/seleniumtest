package pages;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import steps.HomePageSteps;
import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static java.lang.Thread.*;

public class  HomePageTest {
    private final String url = "https://www.qamadness.com/";

    private HomePageSteps homePageSteps = new HomePageSteps();

    String testEmail = "artem@qamadness.com";


    @Test
    public void subscriptionwithvalidEmailTest() {
        open(url);
       /* WebDriver driver = getWebDriver();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");*/
        homePageSteps.clickonEmailfield();
        homePageSteps.inputdatainEmailSubfield(testEmail);
        homePageSteps.clickSubmitbtn();
    }

    {

    }
}
