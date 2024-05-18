import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CheckHanumanPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public CheckHanumanPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void openPlayerPage() {
        driver.get("https://ru.dotabuff.com/players/254370557");
    }

    public void clickSearchButton() {
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/a")));
        searchButton.click();
    }

    public void enterSearchString(String searchString) {
        WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"q\"]")));
        searchInput.sendKeys(searchString);
    }

    public void clickSubmitButton() {
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[1]/form/input[2]")));
        submitButton.click();
    }

    public void clickHanumanResult() {
        WebElement hanumanResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"results_players\"]/article/div/div[4]")));
        hanumanResult.click();
    }
}
