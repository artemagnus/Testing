import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class mainTest extends BaseTest {

    @Before
    public void setUp() {
        super.setUp();
    }

    @Test
    public void openHistory() {
        MyLogger.info("Starting openHistory test");
        historyPage.open();
        MyLogger.info("openHistory test completed");
    }

    @Test
    public void openLastMatchOnDotaBuff() {
        MyLogger.info("Starting openLastMatchOnDotaBuff test");
        dotaBuffPage.open();
        dotaBuffPage.navigateToMatches();
        dotaBuffPage.openLastMatch();
        MyLogger.info("openLastMatchOnDotaBuff test completed");
    }

    @Test
    public void testOpenArc() {
        MyLogger.info("Starting testOpenArc test");
        openArcBuilderPage.open();
        openArcBuilderPage.navigateToHeroesPage();
        openArcBuilderPage.navigateToArcWardenHeroPage();
        openArcBuilderPage.navigateToArcWardenBuildsPage();
        openArcBuilderPage.navigateToPlayerProfile();
        MyLogger.info("testOpenArc test completed");
    }

    @Test
    public void openLongestGame() {
        MyLogger.info("Starting openLongestGame test");
        longestGamePage.openPlayerPage();
        longestGamePage.openDropdownMenu();
        longestGamePage.clickDropdownItem();
        longestGamePage.openLongestGame();
        MyLogger.info("openLongestGame test completed");
    }

    @Test
    public void openMostPopularItemPage() {
        MyLogger.info("Starting openMostPopularItemPage test");
        mostPopularItemPage.openPlayerPage();
        mostPopularItemPage.clickNavigationItem();
        mostPopularItemPage.clickFormElement();
        mostPopularItemPage.navigateToItemsPage();
        MyLogger.info("openMostPopularItemPage test completed");
    }

    @Test
    public void whoBuyBootsOfTravelPage() {
        MyLogger.info("Starting whoBuyBootsOfTravelPage test");
        whoBuyBootsOfTravelPage.navigateToItemsPage();
        whoBuyBootsOfTravelPage.clickBootsOfTravelLink();
        MyLogger.info("whoBuyBootsOfTravelPage test completed");
    }

    @Test
    public void whatRoleIPrefer() {
        MyLogger.info("Starting whatRoleIPrefer test");
        whatRoleIPreferPage.openPlayerPage();
        whatRoleIPreferPage.clickRolesHeader();
        whatRoleIPreferPage.clickPreferredRole();
        MyLogger.info("whatRoleIPrefer test completed");
    }

    @Test
    public void whatLineIPrefer() {
        MyLogger.info("Starting whatLineIPrefer test");
        whatLineIPreferPage.openPlayerPage();
        whatLineIPreferPage.clickRolesHeader();
        whatLineIPreferPage.clickPreferredLine();
        MyLogger.info("whatLineIPrefer test completed");
    }

    @Test
    public void checkHanuman() {
        MyLogger.info("Starting checkHanuman test");
        checkHanumanPage.openPlayerPage();
        checkHanumanPage.clickSearchButton();
        checkHanumanPage.enterSearchString("hanuman");
        checkHanumanPage.clickSubmitButton();
        checkHanumanPage.clickHanumanResult();
        MyLogger.info("checkHanuman test completed");
    }

    @Test
    public void timeFromLastGame() {
        MyLogger.info("Starting timeFromLastGame test");
        timeFromLastGamePage.openPlayerPage();
        timeFromLastGamePage.clickMatchesTab();
        MyLogger.info("timeFromLastGame test completed");
    }

    @After
    public void tearDown() {
        super.tearDown();
    }
}
