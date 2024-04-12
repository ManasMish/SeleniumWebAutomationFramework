package comtta.PageObjectModel;

import comtta.base.commontoallpage;
import comtta.utils.propertyreader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class loginPage extends commontoallpage {
    public loginPage() {
        super();
    }

    // locators
    By username = By.id("login-username");
    By password = By.id("login-password");
    By signButton = By.id("js-login-btn");
    By error_message = By.id("js-notification-box-msg");

    //Page Actions
    public String logintoVWoinvalidcred(){
        enterInput(username, propertyreader.readykey("username"));
        enterInput(password,"admin");
        clickElement(signButton);
        presenceOfElement(error_message);
        visibilityOfElement(error_message);
        return getElement(error_message).getText();
    }
    public void loginVWOvalidcred(){
        enterInput(username,propertyreader.readykey("username"));
        enterInput(password,propertyreader.readykey("password"));
    }
    public dashboardpage afterlogininVWOvalidcred(){
        return new dashboardpage();
    }
}