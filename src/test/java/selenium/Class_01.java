package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Class_01 {
    WebDriver driver;

    @Test
    public void TC_01_Run_On_Firefox() {
        driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.quit();
    }

    @Test
    public void TC_02_Run_On_Chrome() {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.quit();
    }

    @Test
    public void TC_03_Run_On_Edge() {
        driver = new EdgeDriver();
        driver.get("https://api-dev.epicpartner.vn/authenticate/login?ReturnUrl=%2Fconnect%2Fauthorize%3Fresponse_type%3Dcode%26redirect_uri%3Dhttps%253A%252F%252Fevents2-dev.epicpartner.vn%252Fauth%252Flogin%252Fconnect-authorize%26client_id%3Dclient-angular%26scope%3Dopenid%2520offline_access%26state%3DHRXUreCUmdiZAh6lwUqQ%26code_challenge%3Dr0mVlnzuokV-tR05OBxSJmDrSbqkHsCXtagdWNl9_bg%26code_challenge_method%3DS256");
        //driver.quit();

    }
}
