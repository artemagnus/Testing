import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class TimeFromLastGamePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public TimeFromLastGamePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void openPlayerPage() {
        driver.get("https://ru.dotabuff.com/players/254370557");
    }

    public void clickMatchesTab() {
        WebElement matchesTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[3]/div[4]/div[2]/div/nav/ul/li[2]")));
        matchesTab.click();
    }
}
