import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ChangeLanguagePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public ChangeLanguagePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void openPlayerPage() {
        driver.get("https://ru.dotabuff.com/players/254370557");
    }

    public void clickLanguageDropdown() {
        WebElement languageDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[3]/div[6]/nav/ul/li")));
        languageDropdown.click();
    }

    public void selectEnglishLanguage() {
        WebElement englishLanguage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[3]/div[6]/nav/ul/li/ul/li[4]/a")));
        englishLanguage.click();
    }
}
