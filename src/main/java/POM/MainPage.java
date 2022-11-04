package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;
    public  MainPage(WebDriver driver) {this.driver = driver;}
    private final By one = By.xpath("//div[@class='XRsWPe AOvabd'][text()='1']");
    private final By two = By.xpath("//div[@class='XRsWPe AOvabd'][text()='2']");
    private final By three = By.xpath("//div[@class='XRsWPe AOvabd'][text()='3']");
    private final By four = By.xpath("//div[@class='XRsWPe AOvabd'][text()='4']");
    private final By five = By.xpath("//div[@class='XRsWPe AOvabd'][text()='5']");
    private final By six = By.xpath("//div[@class='XRsWPe AOvabd'][text()='6']");
    private final By zero = By.xpath("//div[@class='XRsWPe AOvabd'][text()='0']");

    private final By plus = By.xpath("//div[@class='XRsWPe MEdqYd'][text()='+']");
    private final By minus = By.xpath("//div[@class='XRsWPe MEdqYd'][text()='−']");
    private final By division = By.xpath("//div[@class='XRsWPe MEdqYd'][text()='÷']");
    private final By multiplication = By.xpath("//div[@class='XRsWPe MEdqYd'][text()='×']");
    private final By bracketLeft = By.xpath("//div[@class='XRsWPe MEdqYd'][text()='(']");
    private final By bracketRight = By.xpath("//div[@class='XRsWPe MEdqYd'][text()=')']");
    private final By equals = By.xpath("//div[@class='XRsWPe UUhRt'][text()='=']");
    private final By sin = By.xpath("//div[@class='XRsWPe MEdqYd Krlpq'][text()='sin']");


    // Клики по кнопкам с цифрами
    public void clicButtonOne() {driver.findElement(one).click();}
    public void clicButtonTwo() {driver.findElement(two).click();}
    public void clicButtonThree() {driver.findElement(three).click();}
    public void clicButtonFour() {driver.findElement(four).click();}
    public void clicButtonFive() {driver.findElement(five).click();}
    public void clicButtonSix() {driver.findElement(six).click();}
    public void clicButtonZero() {driver.findElement(zero).click();}
    // Клики по кнопкам с операциями
    public void clicButtonPlus() {driver.findElement(plus).click();}
    public void clicButtonMinus() {driver.findElement(minus).click();}
    public void clicButtonDivision() {driver.findElement(division).click();}
    public void clicButtonMultiplication() {driver.findElement(multiplication).click();}
    public void clicButtonBracketLeftn() {driver.findElement(bracketLeft).click();}
    public void clicButtonBracketRightn() {driver.findElement(bracketRight).click();}
    public void clicButtoneQuals() {driver.findElement(equals).click();}
    public void clicButtonSin() {driver.findElement(sin).click();}

}