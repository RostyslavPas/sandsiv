package surveys;

import enterprise.Enterprise;
import org.testng.annotations.Test;

public class Test_27_Change_Status_IVR {
    @Test
    public void change_status_ivr(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();
    }
}