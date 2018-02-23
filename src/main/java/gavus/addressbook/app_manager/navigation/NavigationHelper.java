package gavus.addressbook.app_manager.navigation;

import gavus.addressbook.app_manager.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Aleksander on 18.08.2016.
 */
public class NavigationHelper extends BaseHelper {

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void openMenuItem(String item) {
        click(By.xpath(".//a[contains(text(), '" + item + "')]"));
    }

    public static class Items {
        public static final String home = "home";
        public static final String addNew = "add new";
        public static final String groups = "groups";
        public static final String nextBirthdays = "next birthdays";
        public static final String printAll = "print all";
    }
}
