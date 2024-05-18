import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HistoryPage {
    private WebDriver driver;

    public HistoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        // Открытие веб-страницы
        driver.get("https://ru.dotabuff.com/players/254370557");
    }
}
