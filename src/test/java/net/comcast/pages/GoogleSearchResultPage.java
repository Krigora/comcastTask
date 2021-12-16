package net.comcast.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchResultPage {

    WebDriver driver;

    public GoogleSearchResultPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(id="result-stats")
    public WebElement resultCount;

    // Results count = About 54,400,000 results (0.64 seconds)
    public int getResultsCount() {
        String[] resultArr = resultCount.getText().split(" ");
        return Integer.parseInt(resultArr[1].replace(",", ""));


    }
}
