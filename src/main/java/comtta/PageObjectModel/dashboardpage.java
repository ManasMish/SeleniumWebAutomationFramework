package comtta.PageObjectModel;

import comtta.base.commontoallpage;
import org.openqa.selenium.By;

public class dashboardpage extends commontoallpage {
    public dashboardpage() {
    }
    // Page Locators
    By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");
    // Page Actions
    public String loggedinusername(){
        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard).getText();
    }
}
