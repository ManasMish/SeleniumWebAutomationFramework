package comtta.basetest;

import comtta.driver.driverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class commontoAllTest {
    @BeforeMethod
    public void setup(){
        driverManager.init();
    }
    @AfterMethod
    public void teardown(){
        driverManager.down();
    }
}
