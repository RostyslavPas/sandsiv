package surveys;

import enterprise.Enterprise;
import org.junit.After;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;

public class Test_7_Add_Question_SMS {
    @Test
    public void add_questions_sms(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();
    }
    @After
    public void clear_browser_session(){

        clearBrowserCookies();
    }
}
