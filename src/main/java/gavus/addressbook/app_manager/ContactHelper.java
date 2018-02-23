package gavus.addressbook.app_manager;

import gavus.addressbook.model.contact.IContact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Alexander Silaev on 23.02.2018.
 */
public class ContactHelper extends BaseHelper {

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void fillFirstName(IContact contact) {
        enter(By.name("firstname"), contact.getFirstName());
    }

    public void fillLastName(IContact contact) {
        enter(By.name("lastname"), contact.getLastName());
    }

    public void fillNickName(IContact contact) {
        enter(By.name("nickname"), contact.getNickName());
    }

    public void fillGroup(IContact contact) {
        if (elementIsDisplayed(By.cssSelector("select[name='new_group']"))) {
            selectByText(By.cssSelector("select[name='new_group']"), contact.getGroup().getGroupName());
        }
    }

    public void submit() {
        click(By.cssSelector("input[type='submit']:nth-of-type(1)"));
    }
}
