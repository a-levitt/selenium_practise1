import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class BankPageFieldsTesting {

    /*@Test
    public void testAlerts() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.navigate().to("https://javascript.info/alert-prompt-confirm");

        *//*WebElement runAlertButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='ln4s349jve']//a[@title='run']")));
        runAlertButton.click();

        // wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        // Assert.assertEquals("Hello", alert.getText());
        alert.accept();*//*

        *//*WebElement runConfirmButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='961z8k6rty']//a[@title='run']")));
        runConfirmButton.click();

        Alert confirm = driver.switchTo().alert();
        confirm.dismiss();
        confirm.accept();
        //Assert.assertEquals("true", confirm.getText());*//*

        WebElement runPromptButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='zckdyq1kpo']//a[@title='run']")));
        runPromptButton.click();

        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys("32");
        prompt.accept();
        // Assert.assertEquals("You are 32 years old!", prompt.getText());

        driver.close();
    }*/

    /*@Test
    public void  testHiddenElement() throws  InterruptedException {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.navigate().to("https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/hidden");

        driver.switchTo().frame("frame_examples");

        WebElement buttonOk = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okButton']")));
        buttonOk.click();

        WebElement textTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='awesome']/h1")));

        Assert.assertEquals("Thanks!", textTitle.getText());

        driver.quit();
    }*/

    /*@Test
    public void testButtonChange() throws InterruptedException{

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.navigate().to("https://www.bankofcyprus.com/en-gb/Personal/pronomia/");
        driver.findElement(By.xpath("//button[@id='ccc-recommended-settings']")).click();

        WebElement buttonCalculate = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='buttonNext1']")));
        buttonCalculate.click();

        WebElement doNotHaveMortageRadioButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[@for='doNotHaveMortage']")));

        WebElement buttonBack = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='buttonPrevious1']")));
        buttonBack.click();

        Assert.assertTrue(wait.until(ExpectedConditions.stalenessOf(doNotHaveMortageRadioButton)));

        driver.quit();
    }*/

    /*@Test
    public void testEBankLogin() {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.navigate().to("https://www.bankofcyprus.com/en-gb/");

        WebElement buttonLogin = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class,'middle-bar cf')]//a[@title='Login 1bank']")));
        String textContentButton = buttonLogin.getAttribute("textContent");
        // textContentButton = textContentButton.replaceAll("\\s+", " ");

        Assert.assertTrue(textContentButton.contains("Login 1bank"));



        driver.quit();
    }*/

    /*@Test
    public void testLoanHomeRenovationDefaultAmount() {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.navigate().to("https://www.bankofcyprus.com/en-gb/other/calculator-page/");

        WebElement housingLoanAmount = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='housingLoanAmount']")));
        String defaultLoanText = housingLoanAmount.getAttribute("value");

        Assert.assertEquals("112000", defaultLoanText);

        driver.quit();
    }*/
}
