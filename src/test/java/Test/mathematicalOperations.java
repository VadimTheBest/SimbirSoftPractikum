package Test;
import POM.MainPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mathematicalOperations {
    WebDriver driver = new ChromeDriver();
    @Before
  public void browserOpen() {
        driver.get("http://google.com/");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Калькулятор\n");
    }
    @Test
    public void checkBaseMathematicalOperations() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clicButtonBracketLeftn();
        mainPage.clicButtonOne();
        mainPage.clicButtonPlus();
        mainPage.clicButtonTwo();
        mainPage.clicButtonBracketRightn();
        mainPage.clicButtonMultiplication();
        mainPage.clicButtonThree();
        mainPage.clicButtonMinus();
        mainPage.clicButtonFour();
        mainPage.clicButtonZero();
        mainPage.clicButtonDivision();
        mainPage.clicButtonFive();
        mainPage.clicButtoneQuals();
        Assert.assertEquals("1", driver.findElement(By.id("cwos")).getText());
    }
    @Test
    public void checkDivisionZero() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clicButtonSix();
        mainPage.clicButtonDivision();
        mainPage.clicButtonZero();
        mainPage.clicButtoneQuals();
        Assert.assertEquals("Infinity", driver.findElement(By.id("cwos")).getText());
    }
    @Test
    public void checkAbsenceErrorMeaning() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clicButtonSin();
        mainPage.clicButtoneQuals();
        Assert.assertEquals("Error", driver.findElement(By.id("cwos")).getText());
    }
    @After
    public void browserClose() {
        driver.quit();
    };
}
