package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.byText;

public class HomePage {

    public SelenideElement submit = $(xpath("//input[@class='wpcf7-form-control wpcf7-submit']"));
}