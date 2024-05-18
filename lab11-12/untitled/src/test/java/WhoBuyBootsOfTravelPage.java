import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WhoBuyBootsOfTravelPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public WhoBuyBootsOfTravelPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void navigateToItemsPage() {
        driver.get("https://ru.dotabuff.com/items");
    }

    public void clickBootsOfTravelLink() {
        WebElement bootsOfTravelLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[3]/div[5]/section/article/table/tbody/tr[21]/td[2]/a")));
        bootsOfTravelLink.click();
    }
}
