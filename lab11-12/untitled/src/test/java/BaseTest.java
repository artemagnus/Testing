import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected WebDriver driver;
    protected DotaBuffPage dotaBuffPage;
    protected OpenArcBuilderPage openArcBuilderPage;
    protected HistoryPage historyPage;
    protected LongestGamePage longestGamePage;
    protected MostPopularItemPage mostPopularItemPage;
    protected WhoBuyBootsOfTravelPage whoBuyBootsOfTravelPage;
    protected WhatRoleIPreferPage whatRoleIPreferPage;
    protected WhatLineIPreferPage whatLineIPreferPage;
    protected ChangeLanguagePage changeLanguagePage;
    protected CheckHanumanPage checkHanumanPage;
    protected TimeFromLastGamePage timeFromLastGamePage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Study\\3c2s\\LBs Doing\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        dotaBuffPage = new DotaBuffPage(driver);
        openArcBuilderPage = new OpenArcBuilderPage(driver);
        historyPage = new HistoryPage(driver);
        longestGamePage = new LongestGamePage(driver);
        mostPopularItemPage = new MostPopularItemPage(driver);
        whoBuyBootsOfTravelPage = new WhoBuyBootsOfTravelPage(driver);
        whatRoleIPreferPage = new WhatRoleIPreferPage(driver);
        whatLineIPreferPage = new WhatLineIPreferPage(driver);
        changeLanguagePage = new ChangeLanguagePage(driver);
        checkHanumanPage = new CheckHanumanPage(driver);
        timeFromLastGamePage = new TimeFromLastGamePage(driver);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
