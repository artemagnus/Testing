import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LongestGamePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public LongestGamePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void openPlayerPage() {
        driver.get("https://ru.dotabuff.com/players/254370557");
    }

    public void openDropdownMenu() {
        WebElement dropdownButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[3]/div[4]/div[2]/div/nav/ul/li[5]")));
        dropdownButton.click();
    }

    public void clickDropdownItem() {
        WebElement dropdownItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[3]/div[4]/div[2]/div/nav/ul/li[5]/ul/li[2]")));
        dropdownItem.click();
    }

    public void openLongestGame() {
        WebElement longestGameButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[3]/div[5]/section/article/div/div[1]/div[2]")));
        longestGameButton.click();
    }
}
