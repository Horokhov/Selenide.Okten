package base;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;
public class BaseTest {
    @BeforeClass(alwaysRun = true, description = "Configs for tests")
    public void configuration() {
        com.codeborne.selenide.Configuration.browser = "edge";
        com.codeborne.selenide.Configuration.holdBrowserOpen = false;
        com.codeborne.selenide.Configuration.startMaximized = true;
        com.codeborne.selenide.Configuration.screenshots = false;
        com.codeborne.selenide.Configuration.headless = true;
        com.codeborne.selenide.Configuration.pageLoadStrategy = "normal";
        com.codeborne.selenide.Configuration.pageLoadTimeout = 20000;
        Configuration.timeout = 10000;
    }
    @BeforeMethod(alwaysRun = true, description = "Opening URL")
    public void setUp() {
        Selenide.open("https://www.google.com");
    }

    @AfterMethod(alwaysRun = true, description = "WebDriver CleanUp")
    public void clean() {
        Selenide.clearBrowserCookies();
        Selenide.refresh();
        Selenide.open("about:blank");
    }

    @AfterSuite(alwaysRun = true, description = "Closing WebDriver")
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
