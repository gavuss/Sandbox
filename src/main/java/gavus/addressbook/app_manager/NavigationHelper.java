package gavus.addressbook.app_manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Aleksander on 18.08.2016.
 */
public class NavigationHelper extends BaseHelper {

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void openGroupPage() {
        click(By.linkText("groups"));
    }
}
