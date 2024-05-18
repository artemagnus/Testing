import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class MostPopularItemPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public MostPopularItemPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void openPlayerPage() {
        driver.get("https://ru.dotabuff.com/players/254370557");
    }

    public void clickNavigationItem() {
        WebElement navigationItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/div[2]/div/nav/ul/li[4]")));
        navigationItem.click();
    }

    public void clickFormElement() {
        WebElement formElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[3]/div[5]/section/footer/div/form/div/dl/dd/div")));
        formElement.click();
    }

    public void navigateToItemsPage() {
        driver.get("https://ru.dotabuff.com/items?date=all");
    }
}
