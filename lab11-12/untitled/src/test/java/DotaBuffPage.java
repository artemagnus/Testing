import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DotaBuffPage {

    private WebDriver driver;

    public DotaBuffPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        // Открытие веб-страницы
        driver.get("https://ru.dotabuff.com/players/254370557");
    }

    public void navigateToMatches() {
        // Нахождение кнопки "Matches" и клик на нее
        WebElement openMatchesButton = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[4]/div[2]/div/nav/ul/li[2]/a"));
        openMatchesButton.click();
    }

    public void openLastMatch() {
        // Нахождение кнопки последнего матча и клик на нее
        WebElement lastMatchButton = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[5]/section/section/article/table/tbody/tr[1]/td[2]/a"));
        lastMatchButton.click();
    }
}
