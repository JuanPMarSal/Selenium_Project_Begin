package utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class Waits {

    WebDriver driver;
    Wait<WebDriver> fwaitsText;
    Wait<WebDriver> fwaitsClick;
    Wait<WebDriver> fwaitsDropDown;
    Wait<WebDriver> fwaitsDropDownByIndex;
    Wait<WebDriver> fwaitsGetText;
    Wait<WebDriver> fwaitsInvisibilityOf;
    Wait<WebDriver> fwaitsVisibilityOf;
    Wait<WebDriver> fwaitsDisabled;
    //WebDriverWait wait;
    DropDown DD;

    public Waits(WebDriver driver) { //Constructor
        this.driver = driver;
        /**wait = new WebDriverWait(driver, 30);  //no se utiliza */
        DD = new DropDown();
        PageFactory.initElements(driver, this);
    }

    public void fluentWaitText(WebElement webElement, String text, int waitingTime) {
        fwaitsText = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(waitingTime))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        fwaitsText.until(ExpectedConditions.elementToBeClickable(webElement));
        WebElement fWait = fwaitsText.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });
        webElement.clear();
        webElement.sendKeys(text);
    }

    public void fluentWaitClick(WebElement webElement, int waitingTime) {
        fwaitsClick = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(waitingTime))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        fwaitsClick.until(ExpectedConditions.visibilityOf(webElement));
        fwaitsClick.until(ExpectedConditions.elementToBeClickable(webElement));
        WebElement fWait = fwaitsClick.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });
        webElement.click();
    }

    public void fluentWaitDropDown(WebElement webElement, String dropDownText, int waitingTime) {
        fwaitsDropDown = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(waitingTime))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        fwaitsDropDown.until(ExpectedConditions.elementToBeClickable(webElement));
        WebElement fWait = fwaitsDropDown.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });
        DD.selectdropdown(webElement, dropDownText);
    }

    public void fluentWaitDropDownByIndex(WebElement webElement, int index, int waitingTime) {
        fwaitsDropDownByIndex = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(waitingTime))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        fwaitsDropDownByIndex.until(ExpectedConditions.elementToBeClickable(webElement));
        WebElement fWait = fwaitsDropDownByIndex.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });
        DD.selectDropdownByIndex(webElement, index);
    }

    public String fluentWaitGetText(WebElement webElement, int waitingTime) {
        fwaitsGetText = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(waitingTime))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        fwaitsGetText.until(ExpectedConditions.visibilityOf(webElement));
        WebElement fWait = fwaitsGetText.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });
        return webElement.getText();
    }

    public void fluentWaitInvisibilityOf(WebElement webElement, int waitingTime) {
        fwaitsInvisibilityOf = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(waitingTime))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class)
                .ignoring(NoSuchWindowException.class);
        fwaitsInvisibilityOf.until(ExpectedConditions.invisibilityOf(webElement));
        WebElement fWait = fwaitsInvisibilityOf.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });
    }

    public void fluentWaitVisibilityOf(WebElement webElement, int waitingTime) {
        fwaitsVisibilityOf = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(waitingTime))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        fwaitsVisibilityOf.until(ExpectedConditions.visibilityOf(webElement));
        WebElement fWait = fwaitsVisibilityOf.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });
    }

    public boolean fluentWaitEnabled(WebElement webElement, int waitingTime) {
        fwaitsDisabled = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(waitingTime))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        WebElement fWait = fwaitsDisabled.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });
        return webElement.isEnabled();
    }

    /*public void waitForThePageToLoad() {
        wait.until(webDriver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete"));
    }*/

}
