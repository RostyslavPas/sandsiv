package surveys;

import enterprise.Enterprise;
import org.testng.annotations.Test;

public class Test_31_Reordering_Questions {
    @Test
    public void reordering_questions(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();
    }
}