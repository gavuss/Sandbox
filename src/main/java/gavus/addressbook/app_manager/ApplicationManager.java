package gavus.addressbook.app_manager;

import gavus.addressbook.app_manager.navigation.NavigationHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.openqa.selenium.remote.BrowserType.FIREFOX;

/**
 * Created by Aleksander on 18.08.2016.
 */
public class ApplicationManager {

    protected WebDriver driver;
    private String browser;
    private GroupHelper groupHelper;
    private NavigationHelper navigationHelper;
    private SessionHelper sessionHelper;
    private ContactHelper contactHelper;

    public void init(long implicitlyWait, String url) {
        setDriver();
        driver.manage().timeouts().implicitlyWait(implicitlyWait, TimeUnit.SECONDS);
        driver.get(url);
        groupHelper = new GroupHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        sessionHelper = new SessionHelper(driver);
        contactHelper = new ContactHelper(driver);
    }

    public void stop() {
        driver.quit();
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    private void setDriver() {
        if (browser.equals(FIREFOX)) {
            driver = new FirefoxDriver();
        } else if (browser.contains(CHROME)) {
            driver = new ChromeDriver();
        }
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
