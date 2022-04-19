import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.junit.Test;
import org.testng.annotations.BeforeTest;

public class loginTest extends Base {

        @Test
        public void loginCase() throws InterruptedException {

            logincicle loginPage = new logincicle(webDriver);
            loginPage.clickLogin();
            loginPage.setEmail("cilsynurindah@gmail.com");
            loginPage.clicknext1();
            Thread.sleep(2000);
            loginPage.setPassw("CilsyBP2022");
            loginPage.clicknext();
            Thread.sleep(2000);
            dasboard dasboardPage = new dasboard(webDriver);
            String namehello = dasboardPage.getName();
        }

//         @Test
//        public void invalidloginCase() throws InterruptedException {
//
//        logincicle loginPage = new logincicle(webDriver);
//        loginPage.clickLogin();
//        loginPage.setEmail("nurindahvaili@gmail.com");
//        loginPage.clicknext1();
//    }
    }

