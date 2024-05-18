import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenArcBuilderPage {

    private WebDriver driver;

    public OpenArcBuilderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        // Открытие веб-страницы
        driver.get("https://ru.dotabuff.com/players/254370557");
    }

    public void navigateToHeroesPage() {
        // Нахождение кнопки "Heroes" и клик на нее
        WebElement heroesButton = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/nav/ul/li[3]/a"));
        heroesButton.click();
    }

    public void navigateToArcWardenHeroPage() {
        // Нахождение ссылки на героя Arc Warden и клик на нее
        WebElement arcWardenLink = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[5]/section[2]/footer/div/a[5]/div/div[2]"));
        arcWardenLink.click();
    }

    public void navigateToArcWardenBuildsPage() {
        // Нахождение кнопки "Guides" и клик на нее
            WebElement buildsButton = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[4]/div[2]/div/nav/ul/li[2]/a"));
        buildsButton.click();
    }

    public void navigateToPlayerProfile() {
        // Нахождение кнопки последнего матча и клик на нее
        WebElement playerProfileButton = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[5]/section[3]/article/div/div[1]/div[2]/a"));
        playerProfileButton.click();
    }
}
