package gavus.addressbook.app_manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import gavus.addressbook.model.user.IUser;

/**
 * Created by Aleksander on 18.08.2016.
 */
public class SessionHelper extends BaseHelper {

    public SessionHelper(WebDriver driver) {
        super(driver);
    }

    public void authorization(IUser user) {
        enter(By.name("user"), user.getLogin());
        enter(By.name("pass"), user.getPassword());
        click(By.xpath("//form[@id='LoginForm']//input[3]"));
    }
}
