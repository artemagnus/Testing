import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        // Установка пути к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "D:\\Study\\3c2s\\LBs Doing\\Drivers\\chromedriver.exe");

        // Создание экземпляра WebDriver
        WebDriver driver = new ChromeDriver();

        // Открытие веб-страницы
        driver.get("https://ru.dotabuff.com/players/254370557");

        // Нахождение кнопки по XPath

        By openMatches= By.xpath("/html/body/div[2]/div[2]/div[3]/div[4]/div[2]/div/nav/ul/li[2]/a");
        WebElement openMatchesButton = driver.findElement(openMatches);
        openMatchesButton.click();

        By lastMatch= By.xpath("/html/body/div[2]/div[2]/div[3]/div[5]/section/section/article/table/tbody/tr[1]/td[2]/a");
        WebElement lastMatchButton = driver.findElement(lastMatch);
        lastMatchButton.click();


        // Закрытие браузера
        // driver.quit();
    }
}
