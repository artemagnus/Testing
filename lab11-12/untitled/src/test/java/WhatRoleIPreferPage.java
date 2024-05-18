import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WhatRoleIPreferPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public WhatRoleIPreferPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void openPlayerPage() {
        driver.get("https://ru.dotabuff.com/players/254370557");
    }

    public void clickRolesHeader() {
        WebElement rolesHeader = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[3]/div[5]/div[1]/div[1]/section[1]/header/div")));
        rolesHeader.click();
    }

    public void clickPreferredRole() {
        WebElement preferredRole = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[3]/div[5]/section/div/form/footer/div/nav/ul/li[8]")));
        preferredRole.click();
    }
}
