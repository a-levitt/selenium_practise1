import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.util.Collections.replaceAll;

public class FirstTest {

    @Test
    public void testEBankLogin() {
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.navigate().to("https://www.bankofcyprus.com/en-gb/");

        WebElement buttonLogin = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class,'middle-bar cf')]//a[@title='Login 1bank']")));
        String textContentButton = buttonLogin.getAttribute("textContent");
        System.out.println(textContentButton.replaceAll("\\s", ""));

        driver.quit();
    }
}
