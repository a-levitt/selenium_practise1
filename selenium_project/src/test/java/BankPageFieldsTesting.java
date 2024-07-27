import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class BankPageFieldsTesting {

    @Test
    public void testButtonChange() {

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
    }

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
