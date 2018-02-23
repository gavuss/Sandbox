package gavus;

import org.junit.After;
import org.junit.Before;
import gavus.addressbook.app_manager.ApplicationManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static org.openqa.selenium.remote.BrowserType.CHROME;

/**
 * Created by Aleksander on 18.08.2016.
 */
public class BaseTest {

    Logger logger = LoggerFactory.getLogger("TestLogger");

    protected final ApplicationManager app = new ApplicationManager();

    @Before
    public void setUp() {
        logger.info("========= BeforeTest =========");
        app.setBrowser(CHROME);
        app.init();
    }

    @After
    public void tearDown() {
        app.stop();
    }


}
