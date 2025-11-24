package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_03_Locator {
    WebDriver driver;

    @BeforeClass
    public void initBrowser() {
        //Arange: Pre-condition
        //mở brower lên
        driver = new FirefoxDriver();
        //mở papge cần test
        driver.get("https://live.techpanda.org/index.php/customer/account/create/");
    }

    @Test
    public void TC_01_Selenium_Locator() {
        //By firstName = By.id("firstname");
        //Tìm elementddeeeer thao tác
        //Chú ý findElement và findElements
        // ID
        driver.findElement(By.id("firstname")).sendKeys("Sendkey là nhập để gửi dữ liệu");
        driver.findElement(By.id("firstname"));//chỉ tìm

        //Classname
        driver.findElement(By.className("customer-name-middlename"));

        //Name
        driver.findElement(By.name("firstname"));

        //Tagname- tìm các element có kiểu giống nhau
        driver.findElements(By.tagName("a"));

        //Link
        driver.findElement(By.linkText("MY ACCCOUNT"));//Tìm phần hiển thị trên UI

        //Partial Link
        driver.findElement(By.partialLinkText("SEARCH"));

        //Css
        driver.findElement(By.cssSelector("input#pasword"));

        //XPath
        driver.findElement(By.xpath("//input[@id='email_address']"));
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
