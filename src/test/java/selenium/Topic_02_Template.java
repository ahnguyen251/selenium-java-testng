package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_02_Template {
    WebDriver driver;

    @BeforeClass
    public void initBrowser() {
        //Arange: Pre-condition
        driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void TC_01_() {
        //Actions- Thao tác vs app/browser

        //Verify-Assert-Kết quả mong đợi
    }

    @Test
    public void TC_02_() {

    }

    @AfterClass
    public void closeBrowser() {
        //Post-Condition
        driver.quit();
    }

}
