package comtta.tests;

import comtta.PageObjectModel.loginPage;
import org.junit.Test;
import org.testng.Assert;

public class loginInvalidCred {
    @Test
    public void testerrormsgInvalidcred(){
        loginPage l1=new loginPage();
        l1.openVWOLoginURL();
        String error_msg=l1.logintoVWoinvalidcred();
        Assert.assertEquals(error_msg,"Your email, password, IP address or location did not match");
    }
}