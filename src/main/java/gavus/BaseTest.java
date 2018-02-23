package gavus;

import gavus.addressbook.app_manager.ApplicationManager;
import org.junit.After;
import org.junit.Before;

import static org.openqa.selenium.remote.BrowserType.CHROME;

/**
 * Created by Aleksander on 18.08.2016.
 */
public class BaseTest {

    protected final ApplicationManager app = new ApplicationManager();
    public static final long WEBDRIVER_TIMEOUT = Long.parseLong(System.getProperty("webdriver.timeout", "30"));
    public static final String baseUrl = "http://localhost/addressbook";

    @Before
    public void setUp() {
        System.out.println("========= BeforeTest =========");
        app.setBrowser(CHROME);
        app.init(WEBDRIVER_TIMEOUT, baseUrl);
    }

    @After
    public void tearDown() {
        app.stop();
    }
}
