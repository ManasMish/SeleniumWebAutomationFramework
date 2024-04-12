package comtta.base;

import comtta.utils.propertyreader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static comtta.driver.driverManager.getDriver;

public class commontoallpage {
    public commontoallpage() {
        // If you want to call something before every Page Object Class call, Put your Code here");
        // Open File, Open Data Base Connection You can write code here
    }
    public void openVWOLoginURL(){
        getDriver().get(propertyreader.readykey("url"));
    }
    public void clickElement(By by){
        getDriver().findElement(by).click();
    }
    public void enterInput(By by,String key){
        getDriver().findElement(by).sendKeys(key);
    }
    public WebElement presenceOfElement(By elementLocation){
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }
    public WebElement visibilityOfElement(By elementLocation){
        return new WebDriverWait(getDriver(),Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }
    public WebElement getElement(By key){
        return getDriver().findElement(key);
    }
}