package steps;

import static com.codeborne.selenide.Condition.*;
import io.qameta.allure.Step;
import pages.HomePage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.isChrome;
import static com.codeborne.selenide.WebDriverRunner.url;


public class HomePageSteps {

    private HomePage homePage = new HomePage();


    @Step
    public void clickonEmailfield() {homePage.emailField.toWebElement().click();}
    //public void clickonEmailfield() {homePage.emailField.setValue("artem@qamadness.com");}

    @Step
    public void inputdatainEmailSubfield(String testEmail) {homePage.emailField.setValue(testEmail);}
    //public void inputdatainEmailSubfield(String testEmail) {homePage.emailField.setValue(testEmail);}
    @Step
    public void clickSubmitbtn() {homePage.submit.click();}
}